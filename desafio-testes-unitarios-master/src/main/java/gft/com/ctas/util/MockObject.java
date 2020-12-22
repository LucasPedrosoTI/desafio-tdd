package gft.com.ctas.util;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Component;

import gft.com.ctas.kafka.message.After;
import gft.com.ctas.kafka.message.CtasMessage;


@Component
public class MockObject {

	public CtasMessage get() {

		CtasMessage msg = new CtasMessage();
		After after = new After();

		msg.setTable("CYBERBANK_CORE.LOG_MOV");
		msg.setOpType("I");
		msg.setOpTs(new Date());
		msg.setCurrentTs(new Date());
		msg.setPos("00000006340067071018");

		after.setId(2699011);
		after.setSubProduct(2107);
		after.setBranch(BigDecimal.valueOf(1));
		after.setOperationId("613320");
		after.setIsoProduct(BigDecimal.valueOf(4));
		after.setProductIsOwn(BigDecimal.valueOf(1));
		after.setBusinessSector(BigDecimal.valueOf(51));
		after.setSourceSubproduct(null);
		after.setSourceBranch(null);
		after.setSourceOperationId(null);
		after.setSourceIsoProduct(null);
		after.setMsgTypeId(BigDecimal.valueOf(200));
		after.setTransactionReason(BigDecimal.valueOf(3));
		after.setPureAction(BigDecimal.valueOf(3));
		after.setTxnActionCode(BigDecimal.valueOf(4));
		after.setTxnDescription("A");
		after.setReferenceNumber(BigDecimal.valueOf(15936999819650015L));
		after.setMovInternalSequenceNum(null);
		after.setChildSequenceNbr(BigDecimal.valueOf(1));
		after.setOriginalReferenceNumber(null);
		after.setTraceNumber(BigDecimal.valueOf(15936999819650015L));
		after.setMovAuthNum(null);
		after.setMovAttentionNum(null);
		after.setCheckNumber(null);
		after.setAmount(BigDecimal.valueOf(5));
		after.setOriginalAmount(null);
		after.setMovDispensedAmount(null);
		after.setMovAddAmount1(null);
		after.setMovAddAmount2(null);
		after.setBusinessDate(new Date());
		after.setMovAcqBusinessDate(null);
		after.setIssueBusinessDate(new Date());
		after.setSourceDate(new Date());
		after.setSourceTime(new Date());
		after.setValuedDate(new Date());
		after.setMovTransmitionDate(null);
		after.setMovTransmitionTime(null);
		after.setMovTmstInAuth(null);
		after.setMovTmstInPre(null);
		after.setMovTmstOutAuth(null);
		after.setMovTmstOutPre(null);
		after.setImputationDate(new Date());
		after.setImputationTime(new Date());
		after.setUserId(BigDecimal.valueOf(303838));
		after.setSupervisorUser(null);
		after.setMovBankSupervisorProfile(null);
		after.setMovBankUserProfile(null);
		after.setMovBankSupervisor(null);
		after.setTerminalUnitId(null);
		after.setTerminal(BigDecimal.valueOf(1));
		after.setTerminalType(BigDecimal.valueOf(1));
		after.setChannel(BigDecimal.valueOf(7));
		after.setOriginBranch(BigDecimal.valueOf(1));
		after.setMovCountableBranch(null);
		after.setMovLocationId(null);
		after.setService(BigDecimal.valueOf(993311442));
		after.setQuotApplied(null);
		after.setConvertedAmount(null);
		after.setExchangeTicketId(null);
		after.setCurrencyCode(BigDecimal.valueOf(1));
		after.setCurrencyCodeOut(BigDecimal.valueOf(1));
		after.setMovCustomer(null);
		after.setMovAccessId(null);
		after.setMovCategoryId(null);
		after.setMovAcquirer(null);
		after.setMovIssuer(null);
		after.setMovOriginator(null);
		after.setMovAffectedBalance(null);
		after.setMovDetAvailBalance(null);
		after.setReversalFlag(BigDecimal.valueOf(0));
		after.setReversalNumber(null);
		after.setReversalUser(null);
		after.setReversalDate(null);
		after.setReversalTime(null);
		after.setReversalReason(null);
		after.setHistoryPass(BigDecimal.valueOf(1));
		after.setIsCash(BigDecimal.valueOf(0));
		after.setIsSiter(BigDecimal.valueOf(1));
		after.setPostPending(BigDecimal.valueOf(0));
		after.setOffLineFormId(null);
		after.setAmountType(BigDecimal.valueOf(3));
		after.setMomentCode(BigDecimal.valueOf(2));
		after.setTermCode(BigDecimal.valueOf(1));
		after.setKeyOtherSystem(null);
		after.setMovNewStatus(null);
		after.setMovOldStatus(null);
		after.setMovPayments(null);
		after.setMovRespCode(null);
		after.setMovResponder(BigDecimal.valueOf(5));
		after.setMovTracki(null);
		after.setMovTrackii(null);
		after.setMovAddDataMsg(null);
		after.setMovAddDataDb(null);
		after.setMovCrmInfoSend(null);
		after.setMovCrmInfoRecv(null);
		after.setStatus(BigDecimal.valueOf(7));
		after.setStatusDate(new Date());
		after.setStatusReason(424);
		after.setStampUser(BigDecimal.valueOf(303838));
		after.setStampAdditional("993311442");
		after.setStampDateTime(new Date());
		after.setDependency(BigDecimal.valueOf(1));
		after.setOperationCurrencyCode(BigDecimal.valueOf(1));
		after.setSourceCurrencyCode(null);
		after.setCustomerSessionNumber(null);
		after.setTransactionNumber(null);
		after.setTeam(null);
		after.setPrty(null);
		after.setComments("convenio tal");
		after.setCategory(null);
		after.setDateFrom(null);
		after.setDateTo(null);
		after.setRootSubproduct(null);
		after.setRootBranch(null);
		after.setRootOperationId(null);
		after.setRootIsoProduct(null);
		after.setRootCurrency(null);
		after.setBalancePostTransaction(BigDecimal.valueOf(5));

		msg.setAfter(after);

		return msg;
	}

}

