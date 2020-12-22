package gft.com.ctas.util;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;

import gft.com.ctas.config.constants.Constants;

/**
 * Classe responsavel por deserealizar objetos do tipo data para Json
 * 
 * @since 09/08/2020
 * @author jeanfernandes
 * @see GsonBuilder
 * 
 */
public class DateDeserializer implements JsonDeserializer<Date> {

	public Date deserialize(JsonElement element, Type type, JsonDeserializationContext context) {

		if (Constants.JAVA_UTIL_DATE_PACKAGE.equals(type.getTypeName())) {

			String date = element.getAsString();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Constants.FORMAT_YYYY_MM_DD_HH_MM_SS);
			simpleDateFormat.setTimeZone(TimeZone.getTimeZone(Constants.TIME_ZONE_UTC));

			Date dateValidate = dateValidate(Constants.FORMAT_YYYY_MM_DD_HH_MM_SS, date, simpleDateFormat);

			if (dateValidate != null)
				return dateValidate;

			dateValidate = dateValidate(Constants.FORMAT_YYYY_MM_DD_HH_MM_SS_SSSSSS, date, simpleDateFormat);

			if (dateValidate != null)
				return dateValidate;

			dateValidate = dateValidate(Constants.FORMAT_YYYY_MM_DD, date, simpleDateFormat);

			if (dateValidate != null)
				return dateValidate;
		}

		return null;
	}

	private Date dateValidate(String pattern, String date, SimpleDateFormat simpleDateFormat) {

		try {

			simpleDateFormat.applyPattern(pattern);
			return simpleDateFormat.parse(date);

		} catch (ParseException e) {
			return null;
		}

	}

}