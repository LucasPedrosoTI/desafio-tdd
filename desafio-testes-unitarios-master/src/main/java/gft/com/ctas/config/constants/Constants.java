package gft.com.ctas.config.constants;

import java.util.regex.Pattern;

public class Constants {
	
	public static final String MSG_SUCCESS = "Dados obtidos com sucesso";
	public static final String MSG_NO_RESULT = "Sua pesquisa não retornou resultado";
	public static final String UTF_8 = "UTF-8";
	public static final String ISO_8859_1 = "ISO-8859-1";
	public static final String FORMAT_YYYY_MM_DD = "yyyy-MM-dd";
	public static final String FORMAT_YYYY_MM_DD_HH_MM_SS_SSSSSS = "yyyy-MM-dd HH:mm:ss.SSSSSS";
	public static final String FORMAT_YYYY_MM_DD_HH_MM_SS = "yyyy/MM/dd HH:mm:ss";
	public static final String JAVA_UTIL_DATE_PACKAGE = "java.util.Date";
	public static final String TIME_ZONE_UTC = "UTC";
	public static final Pattern PATTERN_REPLACE = Pattern.compile("[/.$/m][0-9]*");
	
	private Constants() {
		
	}
	
}
