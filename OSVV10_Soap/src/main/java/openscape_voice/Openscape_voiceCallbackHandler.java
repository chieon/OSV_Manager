/**
 * Openscape_voiceCallbackHandler.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.2 Built on : Jul 13,
 * 2022 (06:38:03 EDT)
 */
package openscape_voice;

/**
 * Openscape_voiceCallbackHandler Callback class, Users can extend this class and implement their
 * own receiveResult and receiveError methods.
 */
public abstract class Openscape_voiceCallbackHandler {

  protected Object clientData;

  /**
   * User can pass in any object that needs to be accessed once the NonBlocking Web service call is
   * finished and appropriate method of this CallBack is called.
   *
   * @param clientData Object mechanism by which the user can pass in user data that will be
   *     avilable at the time this callback is called.
   */
  public Openscape_voiceCallbackHandler(Object clientData) {
    this.clientData = clientData;
  }

  /** Please use this constructor if you don't want to set any clientData */
  public Openscape_voiceCallbackHandler() {
    this.clientData = null;
  }

  /** Get the client data */
  public Object getClientData() {
    return clientData;
  }

  /**
   * auto generated Axis2 call back method for modifyDnmPrefix method override this method for
   * handling normal response from modifyDnmPrefix operation
   */
  public void receiveResultmodifyDnmPrefix(
      openscape_voice.Openscape_voiceStub.ModifyDnmPrefixResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyDnmPrefix operation
   */
  public void receiveErrormodifyDnmPrefix(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyLocationService method override this method for
   * handling normal response from modifyLocationService operation
   */
  public void receiveResultmodifyLocationService(
      openscape_voice.Openscape_voiceStub.ModifyLocationServiceResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyLocationService operation
   */
  public void receiveErrormodifyLocationService(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createLogServer method override this method for
   * handling normal response from createLogServer operation
   */
  public void receiveResultcreateLogServer(
      openscape_voice.Openscape_voiceStub.CreateLogServerResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createLogServer operation
   */
  public void receiveErrorcreateLogServer(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryPFR method override this method for handling
   * normal response from queryPFR operation
   */
  public void receiveResultqueryPFR(openscape_voice.Openscape_voiceStub.QueryPFRResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryPFR operation
   */
  public void receiveErrorqueryPFR(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeEsrpQueue method override this method for
   * handling normal response from removeEsrpQueue operation
   */
  public void receiveResultremoveEsrpQueue(
      openscape_voice.Openscape_voiceStub.RemoveEsrpQueueResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeEsrpQueue operation
   */
  public void receiveErrorremoveEsrpQueue(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteServiceGroupMember method override this method
   * for handling normal response from deleteServiceGroupMember operation
   */
  public void receiveResultdeleteServiceGroupMember(
      openscape_voice.Openscape_voiceStub.DeleteServiceGroupMemberResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteServiceGroupMember operation
   */
  public void receiveErrordeleteServiceGroupMember(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateDnReservation method override this method for
   * handling normal response from updateDnReservation operation
   */
  public void receiveResultupdateDnReservation(
      openscape_voice.Openscape_voiceStub.UpdateDnReservationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateDnReservation operation
   */
  public void receiveErrorupdateDnReservation(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryEnumServer method override this method for
   * handling normal response from queryEnumServer operation
   */
  public void receiveResultqueryEnumServer(
      openscape_voice.Openscape_voiceStub.EnumServerResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryEnumServer operation
   */
  public void receiveErrorqueryEnumServer(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateBGMainNumber2 method override this method for
   * handling normal response from updateBGMainNumber2 operation
   */
  public void receiveResultupdateBGMainNumber2(
      openscape_voice.Openscape_voiceStub.UpdateBGMainNumberResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateBGMainNumber2 operation
   */
  public void receiveErrorupdateBGMainNumber2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeCallingLocation method override this method for
   * handling normal response from removeCallingLocation operation
   */
  public void receiveResultremoveCallingLocation(
      openscape_voice.Openscape_voiceStub.RemoveCallingLocationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeCallingLocation operation
   */
  public void receiveErrorremoveCallingLocation(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getBgSpeedDialListIds method override this method for
   * handling normal response from getBgSpeedDialListIds operation
   */
  public void receiveResultgetBgSpeedDialListIds(
      openscape_voice.Openscape_voiceStub.GetBgSpeedDialListIdsResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getBgSpeedDialListIds operation
   */
  public void receiveErrorgetBgSpeedDialListIds(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getJobListByOption2 method override this method for
   * handling normal response from getJobListByOption2 operation
   */
  public void receiveResultgetJobListByOption2(
      openscape_voice.Openscape_voiceStub.GetJobListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getJobListByOption2 operation
   */
  public void receiveErrorgetJobListByOption2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateConnectionInfo2 method override this method for
   * handling normal response from updateConnectionInfo2 operation
   */
  public void receiveResultupdateConnectionInfo2(
      openscape_voice.Openscape_voiceStub.UpdateConnectionInfoResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateConnectionInfo2 operation
   */
  public void receiveErrorupdateConnectionInfo2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyTrunk method override this method for handling
   * normal response from modifyTrunk operation
   */
  public void receiveResultmodifyTrunk(
      openscape_voice.Openscape_voiceStub.ModifyTrunkResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyTrunk operation
   */
  public void receiveErrormodifyTrunk(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteEAGroupMemberAuxLine method override this
   * method for handling normal response from deleteEAGroupMemberAuxLine operation
   */
  public void receiveResultdeleteEAGroupMemberAuxLine(
      openscape_voice.Openscape_voiceStub.DeleteEAGroupMemberAuxLineResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteEAGroupMemberAuxLine operation
   */
  public void receiveErrordeleteEAGroupMemberAuxLine(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteDnmNormalization method override this method
   * for handling normal response from deleteDnmNormalization operation
   */
  public void receiveResultdeleteDnmNormalization(
      openscape_voice.Openscape_voiceStub.DeleteDnmNormalizationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteDnmNormalization operation
   */
  public void receiveErrordeleteDnmNormalization(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteBgSpeedDialList method override this method for
   * handling normal response from deleteBgSpeedDialList operation
   */
  public void receiveResultdeleteBgSpeedDialList(
      openscape_voice.Openscape_voiceStub.DeleteBgSpeedDialListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteBgSpeedDialList operation
   */
  public void receiveErrordeleteBgSpeedDialList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getAliDB method override this method for handling
   * normal response from getAliDB operation
   */
  public void receiveResultgetAliDB(openscape_voice.Openscape_voiceStub.GetAliDBResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getAliDB operation
   */
  public void receiveErrorgetAliDB(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getNodeInfo method override this method for handling
   * normal response from getNodeInfo operation
   */
  public void receiveResultgetNodeInfo(
      openscape_voice.Openscape_voiceStub.GetNodeInfoResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getNodeInfo operation
   */
  public void receiveErrorgetNodeInfo(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createServerFE method override this method for
   * handling normal response from createServerFE operation
   */
  public void receiveResultcreateServerFE(
      openscape_voice.Openscape_voiceStub.CreateServerFEResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createServerFE operation
   */
  public void receiveErrorcreateServerFE(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createDatabaseJob method override this method for
   * handling normal response from createDatabaseJob operation
   */
  public void receiveResultcreateDatabaseJob(
      openscape_voice.Openscape_voiceStub.CreateDatabaseJobResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createDatabaseJob operation
   */
  public void receiveErrorcreateDatabaseJob(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryAliDBs method override this method for handling
   * normal response from queryAliDBs operation
   */
  public void receiveResultqueryAliDBs(
      openscape_voice.Openscape_voiceStub.QueryAliDBsResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryAliDBs operation
   */
  public void receiveErrorqueryAliDBs(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getTrunk method override this method for handling
   * normal response from getTrunk operation
   */
  public void receiveResultgetTrunk(openscape_voice.Openscape_voiceStub.GetTrunkResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getTrunk operation
   */
  public void receiveErrorgetTrunk(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for massModifyEndpoints method override this method for
   * handling normal response from massModifyEndpoints operation
   */
  public void receiveResultmassModifyEndpoints(
      openscape_voice.Openscape_voiceStub.MassModifyEndpointsResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * massModifyEndpoints operation
   */
  public void receiveErrormassModifyEndpoints(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getMobileClientProfileList method override this
   * method for handling normal response from getMobileClientProfileList operation
   */
  public void receiveResultgetMobileClientProfileList(
      openscape_voice.Openscape_voiceStub.GetMobileClientProfileListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getMobileClientProfileList operation
   */
  public void receiveErrorgetMobileClientProfileList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateEpFeatures2 method override this method for
   * handling normal response from updateEpFeatures2 operation
   */
  public void receiveResultupdateEpFeatures2(
      openscape_voice.Openscape_voiceStub.UpdateEpFeaturesResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateEpFeatures2 operation
   */
  public void receiveErrorupdateEpFeatures2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyHeldServer method override this method for
   * handling normal response from modifyHeldServer operation
   */
  public void receiveResultmodifyHeldServer(
      openscape_voice.Openscape_voiceStub.ModifyHeldServerResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyHeldServer operation
   */
  public void receiveErrormodifyHeldServer(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryDnmLocalTollExchangeCodes method override this
   * method for handling normal response from queryDnmLocalTollExchangeCodes operation
   */
  public void receiveResultqueryDnmLocalTollExchangeCodes(
      openscape_voice.Openscape_voiceStub.QueryDnmLocalTollExchangeCodesResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryDnmLocalTollExchangeCodes operation
   */
  public void receiveErrorqueryDnmLocalTollExchangeCodes(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getLinPool method override this method for handling
   * normal response from getLinPool operation
   */
  public void receiveResultgetLinPool(
      openscape_voice.Openscape_voiceStub.GetLinPoolResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getLinPool operation
   */
  public void receiveErrorgetLinPool(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getJobInfo2 method override this method for handling
   * normal response from getJobInfo2 operation
   */
  public void receiveResultgetJobInfo2(
      openscape_voice.Openscape_voiceStub.GetJobInfoResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getJobInfo2 operation
   */
  public void receiveErrorgetJobInfo2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for auditEsrpQueue method override this method for
   * handling normal response from auditEsrpQueue operation
   */
  public void receiveResultauditEsrpQueue(
      openscape_voice.Openscape_voiceStub.AuditEsrpQueueResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * auditEsrpQueue operation
   */
  public void receiveErrorauditEsrpQueue(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deletePFR method override this method for handling
   * normal response from deletePFR operation
   */
  public void receiveResultdeletePFR(openscape_voice.Openscape_voiceStub.DeletePFRResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deletePFR operation
   */
  public void receiveErrordeletePFR(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for unassignRoute method override this method for
   * handling normal response from unassignRoute operation
   */
  public void receiveResultunassignRoute(
      openscape_voice.Openscape_voiceStub.UnassignRouteResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * unassignRoute operation
   */
  public void receiveErrorunassignRoute(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateBGFeatures2 method override this method for
   * handling normal response from updateBGFeatures2 operation
   */
  public void receiveResultupdateBGFeatures2(
      openscape_voice.Openscape_voiceStub.UpdateBGFeaturesResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateBGFeatures2 operation
   */
  public void receiveErrorupdateBGFeatures2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getBgSpeedDialList method override this method for
   * handling normal response from getBgSpeedDialList operation
   */
  public void receiveResultgetBgSpeedDialList(
      openscape_voice.Openscape_voiceStub.GetBgSpeedDialListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getBgSpeedDialList operation
   */
  public void receiveErrorgetBgSpeedDialList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for addCommunityGroupMember method override this method
   * for handling normal response from addCommunityGroupMember operation
   */
  public void receiveResultaddCommunityGroupMember(
      openscape_voice.Openscape_voiceStub.AddCommunityGroupMemberResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * addCommunityGroupMember operation
   */
  public void receiveErroraddCommunityGroupMember(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteLogClient method override this method for
   * handling normal response from deleteLogClient operation
   */
  public void receiveResultdeleteLogClient(
      openscape_voice.Openscape_voiceStub.DeleteLogClientResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteLogClient operation
   */
  public void receiveErrordeleteLogClient(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryCORInfoList method override this method for
   * handling normal response from queryCORInfoList operation
   */
  public void receiveResultqueryCORInfoList(
      openscape_voice.Openscape_voiceStub.QueryCORInfoListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryCORInfoList operation
   */
  public void receiveErrorqueryCORInfoList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getSisPatchSetList method override this method for
   * handling normal response from getSisPatchSetList operation
   */
  public void receiveResultgetSisPatchSetList(
      openscape_voice.Openscape_voiceStub.GetSisPatchSetListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getSisPatchSetList operation
   */
  public void receiveErrorgetSisPatchSetList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createCACPolicy method override this method for
   * handling normal response from createCACPolicy operation
   */
  public void receiveResultcreateCACPolicy(
      openscape_voice.Openscape_voiceStub.CreateCACPolicyResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createCACPolicy operation
   */
  public void receiveErrorcreateCACPolicy(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyMlhgInfo2 method override this method for
   * handling normal response from modifyMlhgInfo2 operation
   */
  public void receiveResultmodifyMlhgInfo2(openscape_voice.Openscape_voiceStub.MlhgResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyMlhgInfo2 operation
   */
  public void receiveErrormodifyMlhgInfo2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryDnmPrefix method override this method for
   * handling normal response from queryDnmPrefix operation
   */
  public void receiveResultqueryDnmPrefix(
      openscape_voice.Openscape_voiceStub.QueryDnmPrefixResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryDnmPrefix operation
   */
  public void receiveErrorqueryDnmPrefix(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteAliDB method override this method for handling
   * normal response from deleteAliDB operation
   */
  public void receiveResultdeleteAliDB(
      openscape_voice.Openscape_voiceStub.DeleteAliDBResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteAliDB operation
   */
  public void receiveErrordeleteAliDB(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryHomeDn method override this method for handling
   * normal response from queryHomeDn operation
   */
  public void receiveResultqueryHomeDn(openscape_voice.Openscape_voiceStub.HomeDnResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryHomeDn operation
   */
  public void receiveErrorqueryHomeDn(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getPnPExtensionList2 method override this method for
   * handling normal response from getPnPExtensionList2 operation
   */
  public void receiveResultgetPnPExtensionList2(
      openscape_voice.Openscape_voiceStub.PnpExtensionListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getPnPExtensionList2 operation
   */
  public void receiveErrorgetPnPExtensionList2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getLoggedEvents method override this method for
   * handling normal response from getLoggedEvents operation
   */
  public void receiveResultgetLoggedEvents(
      openscape_voice.Openscape_voiceStub.GetLoggedEventsResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getLoggedEvents operation
   */
  public void receiveErrorgetLoggedEvents(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateParkingLot method override this method for
   * handling normal response from updateParkingLot operation
   */
  public void receiveResultupdateParkingLot(
      openscape_voice.Openscape_voiceStub.UpdateParkingLotResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateParkingLot operation
   */
  public void receiveErrorupdateParkingLot(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateFeatureProfile2 method override this method for
   * handling normal response from updateFeatureProfile2 operation
   */
  public void receiveResultupdateFeatureProfile2(
      openscape_voice.Openscape_voiceStub.UpdateFeatureProfileResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateFeatureProfile2 operation
   */
  public void receiveErrorupdateFeatureProfile2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getNumberPlanList2 method override this method for
   * handling normal response from getNumberPlanList2 operation
   */
  public void receiveResultgetNumberPlanList2(
      openscape_voice.Openscape_voiceStub.GetNumberPlanListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getNumberPlanList2 operation
   */
  public void receiveErrorgetNumberPlanList2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createBgSpeedDialList method override this method for
   * handling normal response from createBgSpeedDialList operation
   */
  public void receiveResultcreateBgSpeedDialList(
      openscape_voice.Openscape_voiceStub.CreateBgSpeedDialListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createBgSpeedDialList operation
   */
  public void receiveErrorcreateBgSpeedDialList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeHomeDn method override this method for handling
   * normal response from removeHomeDn operation
   */
  public void receiveResultremoveHomeDn(
      openscape_voice.Openscape_voiceStub.RemoveHomeDnResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeHomeDn operation
   */
  public void receiveErrorremoveHomeDn(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for addBcastMembers method override this method for
   * handling normal response from addBcastMembers operation
   */
  public void receiveResultaddBcastMembers(
      openscape_voice.Openscape_voiceStub.AddBcastMembersResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * addBcastMembers operation
   */
  public void receiveErroraddBcastMembers(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryCACGroup method override this method for
   * handling normal response from queryCACGroup operation
   */
  public void receiveResultqueryCACGroup(
      openscape_voice.Openscape_voiceStub.QueryCACGroupResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryCACGroup operation
   */
  public void receiveErrorqueryCACGroup(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyLinPool method override this method for
   * handling normal response from modifyLinPool operation
   */
  public void receiveResultmodifyLinPool(
      openscape_voice.Openscape_voiceStub.ModifyLinPoolResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyLinPool operation
   */
  public void receiveErrormodifyLinPool(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryDnmPrefixList method override this method for
   * handling normal response from queryDnmPrefixList operation
   */
  public void receiveResultqueryDnmPrefixList(
      openscape_voice.Openscape_voiceStub.QueryDnmPrefixListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryDnmPrefixList operation
   */
  public void receiveErrorqueryDnmPrefixList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateSubscriberStatus2 method override this method
   * for handling normal response from updateSubscriberStatus2 operation
   */
  public void receiveResultupdateSubscriberStatus2(
      openscape_voice.Openscape_voiceStub.UpdateSubscriberStatusResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateSubscriberStatus2 operation
   */
  public void receiveErrorupdateSubscriberStatus2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeLostServer method override this method for
   * handling normal response from removeLostServer operation
   */
  public void receiveResultremoveLostServer(
      openscape_voice.Openscape_voiceStub.RemoveLostServerResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeLostServer operation
   */
  public void receiveErrorremoveLostServer(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeRemoteCpuGroups method override this method for
   * handling normal response from removeRemoteCpuGroups operation
   */
  public void receiveResultremoveRemoteCpuGroups(
      openscape_voice.Openscape_voiceStub.RemoveRemoteCpuGroupsResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeRemoteCpuGroups operation
   */
  public void receiveErrorremoveRemoteCpuGroups(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getEACockpitDynamicData method override this method
   * for handling normal response from getEACockpitDynamicData operation
   */
  public void receiveResultgetEACockpitDynamicData(
      openscape_voice.Openscape_voiceStub.GetEACockpitDynamicDataResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getEACockpitDynamicData operation
   */
  public void receiveErrorgetEACockpitDynamicData(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for collectLogFiles method override this method for
   * handling normal response from collectLogFiles operation
   */
  public void receiveResultcollectLogFiles(
      openscape_voice.Openscape_voiceStub.CollectLogFilesResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * collectLogFiles operation
   */
  public void receiveErrorcollectLogFiles(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getVersion method override this method for handling
   * normal response from getVersion operation
   */
  public void receiveResultgetVersion(
      openscape_voice.Openscape_voiceStub.GetVersionResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getVersion operation
   */
  public void receiveErrorgetVersion(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyAliDB method override this method for handling
   * normal response from modifyAliDB operation
   */
  public void receiveResultmodifyAliDB(
      openscape_voice.Openscape_voiceStub.ModifyAliDBResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyAliDB operation
   */
  public void receiveErrormodifyAliDB(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for addContactList2 method override this method for
   * handling normal response from addContactList2 operation
   */
  public void receiveResultaddContactList2(
      openscape_voice.Openscape_voiceStub.AddContactListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * addContactList2 operation
   */
  public void receiveErroraddContactList2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteTrunk method override this method for handling
   * normal response from deleteTrunk operation
   */
  public void receiveResultdeleteTrunk(
      openscape_voice.Openscape_voiceStub.DeleteTrunkResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteTrunk operation
   */
  public void receiveErrordeleteTrunk(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for listHGMembers method override this method for
   * handling normal response from listHGMembers operation
   */
  public void receiveResultlistHGMembers(
      openscape_voice.Openscape_voiceStub.ListHGMembersResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * listHGMembers operation
   */
  public void receiveErrorlistHGMembers(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyBcastMembers method override this method for
   * handling normal response from modifyBcastMembers operation
   */
  public void receiveResultmodifyBcastMembers(
      openscape_voice.Openscape_voiceStub.ModifyBcastMembersResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyBcastMembers operation
   */
  public void receiveErrormodifyBcastMembers(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyBcastGroup method override this method for
   * handling normal response from modifyBcastGroup operation
   */
  public void receiveResultmodifyBcastGroup(
      openscape_voice.Openscape_voiceStub.ModifyBcastGroupResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyBcastGroup operation
   */
  public void receiveErrormodifyBcastGroup(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyCertificate method override this method for
   * handling normal response from modifyCertificate operation
   */
  public void receiveResultmodifyCertificate(
      openscape_voice.Openscape_voiceStub.ModifyCertificateResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyCertificate operation
   */
  public void receiveErrormodifyCertificate(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateSubscriberDn2 method override this method for
   * handling normal response from updateSubscriberDn2 operation
   */
  public void receiveResultupdateSubscriberDn2(
      openscape_voice.Openscape_voiceStub.UpdateSubscriberDnResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateSubscriberDn2 operation
   */
  public void receiveErrorupdateSubscriberDn2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createMlhg2 method override this method for handling
   * normal response from createMlhg2 operation
   */
  public void receiveResultcreateMlhg2(openscape_voice.Openscape_voiceStub.MlhgResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createMlhg2 operation
   */
  public void receiveErrorcreateMlhg2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyDnmModification method override this method for
   * handling normal response from modifyDnmModification operation
   */
  public void receiveResultmodifyDnmModification(
      openscape_voice.Openscape_voiceStub.ModifyDnmModificationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyDnmModification operation
   */
  public void receiveErrormodifyDnmModification(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeEndpointProvider method override this method
   * for handling normal response from removeEndpointProvider operation
   */
  public void receiveResultremoveEndpointProvider(
      openscape_voice.Openscape_voiceStub.RemoveEndpointProviderResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeEndpointProvider operation
   */
  public void receiveErrorremoveEndpointProvider(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getNodePatchSetList method override this method for
   * handling normal response from getNodePatchSetList operation
   */
  public void receiveResultgetNodePatchSetList(
      openscape_voice.Openscape_voiceStub.GetNodePatchSetListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getNodePatchSetList operation
   */
  public void receiveErrorgetNodePatchSetList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteCOR method override this method for handling
   * normal response from deleteCOR operation
   */
  public void receiveResultdeleteCOR(openscape_voice.Openscape_voiceStub.DeleteCORResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteCOR operation
   */
  public void receiveErrordeleteCOR(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getSystemSipEntryList method override this method for
   * handling normal response from getSystemSipEntryList operation
   */
  public void receiveResultgetSystemSipEntryList(
      openscape_voice.Openscape_voiceStub.GetSystemSipEntryListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getSystemSipEntryList operation
   */
  public void receiveErrorgetSystemSipEntryList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyCACPolicy method override this method for
   * handling normal response from modifyCACPolicy operation
   */
  public void receiveResultmodifyCACPolicy(
      openscape_voice.Openscape_voiceStub.ModifyCACPolicyResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyCACPolicy operation
   */
  public void receiveErrormodifyCACPolicy(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createDestCode2 method override this method for
   * handling normal response from createDestCode2 operation
   */
  public void receiveResultcreateDestCode2(
      openscape_voice.Openscape_voiceStub.DestCodeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createDestCode2 operation
   */
  public void receiveErrorcreateDestCode2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getBGInfoByRel method override this method for
   * handling normal response from getBGInfoByRel operation
   */
  public void receiveResultgetBGInfoByRel(openscape_voice.Openscape_voiceStub.GetBGResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getBGInfoByRel operation
   */
  public void receiveErrorgetBGInfoByRel(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyCSTAApplication method override this method for
   * handling normal response from modifyCSTAApplication operation
   */
  public void receiveResultmodifyCSTAApplication(
      openscape_voice.Openscape_voiceStub.ModifyCSTAApplicationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyCSTAApplication operation
   */
  public void receiveErrormodifyCSTAApplication(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getOpMode method override this method for handling
   * normal response from getOpMode operation
   */
  public void receiveResultgetOpMode(openscape_voice.Openscape_voiceStub.GetOpModeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getOpMode operation
   */
  public void receiveErrorgetOpMode(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for addCACGroupAddr method override this method for
   * handling normal response from addCACGroupAddr operation
   */
  public void receiveResultaddCACGroupAddr(
      openscape_voice.Openscape_voiceStub.AddCACGroupAddrResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * addCACGroupAddr operation
   */
  public void receiveErroraddCACGroupAddr(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createIntercept method override this method for
   * handling normal response from createIntercept operation
   */
  public void receiveResultcreateIntercept(
      openscape_voice.Openscape_voiceStub.CreateInterceptResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createIntercept operation
   */
  public void receiveErrorcreateIntercept(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteDnmPrefix method override this method for
   * handling normal response from deleteDnmPrefix operation
   */
  public void receiveResultdeleteDnmPrefix(
      openscape_voice.Openscape_voiceStub.DeleteDnmPrefixResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteDnmPrefix operation
   */
  public void receiveErrordeleteDnmPrefix(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for setConfigParmData method override this method for
   * handling normal response from setConfigParmData operation
   */
  public void receiveResultsetConfigParmData(
      openscape_voice.Openscape_voiceStub.SetConfigParmDataResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * setConfigParmData operation
   */
  public void receiveErrorsetConfigParmData(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteParkingLot method override this method for
   * handling normal response from deleteParkingLot operation
   */
  public void receiveResultdeleteParkingLot(
      openscape_voice.Openscape_voiceStub.DeleteParkingLotResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteParkingLot operation
   */
  public void receiveErrordeleteParkingLot(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getConfigParmData method override this method for
   * handling normal response from getConfigParmData operation
   */
  public void receiveResultgetConfigParmData(
      openscape_voice.Openscape_voiceStub.GetConfigParmDataResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getConfigParmData operation
   */
  public void receiveErrorgetConfigParmData(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteBGDept2 method override this method for
   * handling normal response from deleteBGDept2 operation
   */
  public void receiveResultdeleteBGDept2(
      openscape_voice.Openscape_voiceStub.DeleteBGDeptResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteBGDept2 operation
   */
  public void receiveErrordeleteBGDept2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteMlhg2 method override this method for handling
   * normal response from deleteMlhg2 operation
   */
  public void receiveResultdeleteMlhg2(openscape_voice.Openscape_voiceStub.MlhgResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteMlhg2 operation
   */
  public void receiveErrordeleteMlhg2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getSystemSipEntryInfo method override this method for
   * handling normal response from getSystemSipEntryInfo operation
   */
  public void receiveResultgetSystemSipEntryInfo(
      openscape_voice.Openscape_voiceStub.GetSystemSipEntryInfoResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getSystemSipEntryInfo operation
   */
  public void receiveErrorgetSystemSipEntryInfo(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyTrafficType method override this method for
   * handling normal response from modifyTrafficType operation
   */
  public void receiveResultmodifyTrafficType(
      openscape_voice.Openscape_voiceStub.ModifyTrafficTypeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyTrafficType operation
   */
  public void receiveErrormodifyTrafficType(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getEpInfo2 method override this method for handling
   * normal response from getEpInfo2 operation
   */
  public void receiveResultgetEpInfo2(openscape_voice.Openscape_voiceStub.GetEpInfoResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getEpInfo2 operation
   */
  public void receiveErrorgetEpInfo2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteContactList2 method override this method for
   * handling normal response from deleteContactList2 operation
   */
  public void receiveResultdeleteContactList2(
      openscape_voice.Openscape_voiceStub.DeleteContactListResultE result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteContactList2 operation
   */
  public void receiveErrordeleteContactList2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for querySipReason method override this method for
   * handling normal response from querySipReason operation
   */
  public void receiveResultquerySipReason(
      openscape_voice.Openscape_voiceStub.SipReasonResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * querySipReason operation
   */
  public void receiveErrorquerySipReason(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryResponsibleDomains method override this method
   * for handling normal response from queryResponsibleDomains operation
   */
  public void receiveResultqueryResponsibleDomains(
      openscape_voice.Openscape_voiceStub.QueryResponsibleDomainsResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryResponsibleDomains operation
   */
  public void receiveErrorqueryResponsibleDomains(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for hotDeskingLogOff2 method override this method for
   * handling normal response from hotDeskingLogOff2 operation
   */
  public void receiveResulthotDeskingLogOff2(
      openscape_voice.Openscape_voiceStub.HotDeskingLogOffResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * hotDeskingLogOff2 operation
   */
  public void receiveErrorhotDeskingLogOff2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getAuthCode method override this method for handling
   * normal response from getAuthCode operation
   */
  public void receiveResultgetAuthCode(
      openscape_voice.Openscape_voiceStub.GetAuthCodeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getAuthCode operation
   */
  public void receiveErrorgetAuthCode(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeClassService method override this method for
   * handling normal response from removeClassService operation
   */
  public void receiveResultremoveClassService(
      openscape_voice.Openscape_voiceStub.RemoveClassServiceResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeClassService operation
   */
  public void receiveErrorremoveClassService(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyDnmNormalization method override this method
   * for handling normal response from modifyDnmNormalization operation
   */
  public void receiveResultmodifyDnmNormalization(
      openscape_voice.Openscape_voiceStub.ModifyDnmNormalizationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyDnmNormalization operation
   */
  public void receiveErrormodifyDnmNormalization(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getEAGroupListExtended method override this method
   * for handling normal response from getEAGroupListExtended operation
   */
  public void receiveResultgetEAGroupListExtended(
      openscape_voice.Openscape_voiceStub.GetEAGroupListExtendedResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getEAGroupListExtended operation
   */
  public void receiveErrorgetEAGroupListExtended(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createHomeDn method override this method for handling
   * normal response from createHomeDn operation
   */
  public void receiveResultcreateHomeDn(
      openscape_voice.Openscape_voiceStub.CreateHomeDnResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createHomeDn operation
   */
  public void receiveErrorcreateHomeDn(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createCodeProcess method override this method for
   * handling normal response from createCodeProcess operation
   */
  public void receiveResultcreateCodeProcess(
      openscape_voice.Openscape_voiceStub.CreateCodeProcessResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createCodeProcess operation
   */
  public void receiveErrorcreateCodeProcess(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createLinPool method override this method for
   * handling normal response from createLinPool operation
   */
  public void receiveResultcreateLinPool(
      openscape_voice.Openscape_voiceStub.CreateLinPoolResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createLinPool operation
   */
  public void receiveErrorcreateLinPool(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for unassignTreatment method override this method for
   * handling normal response from unassignTreatment operation
   */
  public void receiveResultunassignTreatment(
      openscape_voice.Openscape_voiceStub.UnassignTreatmentResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * unassignTreatment operation
   */
  public void receiveErrorunassignTreatment(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createPFR method override this method for handling
   * normal response from createPFR operation
   */
  public void receiveResultcreatePFR(openscape_voice.Openscape_voiceStub.CreatePFRResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createPFR operation
   */
  public void receiveErrorcreatePFR(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeBranchOffice method override this method for
   * handling normal response from removeBranchOffice operation
   */
  public void receiveResultremoveBranchOffice(
      openscape_voice.Openscape_voiceStub.RemoveBranchOfficeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeBranchOffice operation
   */
  public void receiveErrorremoveBranchOffice(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryLinPoolList method override this method for
   * handling normal response from queryLinPoolList operation
   */
  public void receiveResultqueryLinPoolList(
      openscape_voice.Openscape_voiceStub.QueryLinPoolListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryLinPoolList operation
   */
  public void receiveErrorqueryLinPoolList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteAuthCode method override this method for
   * handling normal response from deleteAuthCode operation
   */
  public void receiveResultdeleteAuthCode(
      openscape_voice.Openscape_voiceStub.AuthCodeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteAuthCode operation
   */
  public void receiveErrordeleteAuthCode(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createEsrpPolicy method override this method for
   * handling normal response from createEsrpPolicy operation
   */
  public void receiveResultcreateEsrpPolicy(
      openscape_voice.Openscape_voiceStub.CreateEsrpPolicyResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createEsrpPolicy operation
   */
  public void receiveErrorcreateEsrpPolicy(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyLogServer method override this method for
   * handling normal response from modifyLogServer operation
   */
  public void receiveResultmodifyLogServer(
      openscape_voice.Openscape_voiceStub.ModifyLogServerResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyLogServer operation
   */
  public void receiveErrormodifyLogServer(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getCRLList method override this method for handling
   * normal response from getCRLList operation
   */
  public void receiveResultgetCRLList(
      openscape_voice.Openscape_voiceStub.GetCRLListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getCRLList operation
   */
  public void receiveErrorgetCRLList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getServerFE method override this method for handling
   * normal response from getServerFE operation
   */
  public void receiveResultgetServerFE(
      openscape_voice.Openscape_voiceStub.GetServerFEResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getServerFE operation
   */
  public void receiveErrorgetServerFE(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getUpgradeStatus method override this method for
   * handling normal response from getUpgradeStatus operation
   */
  public void receiveResultgetUpgradeStatus(
      openscape_voice.Openscape_voiceStub.GetUpgradeStatusResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getUpgradeStatus operation
   */
  public void receiveErrorgetUpgradeStatus(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createPnpExtension2 method override this method for
   * handling normal response from createPnpExtension2 operation
   */
  public void receiveResultcreatePnpExtension2(
      openscape_voice.Openscape_voiceStub.PnpExtensionResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createPnpExtension2 operation
   */
  public void receiveErrorcreatePnpExtension2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeSipReason method override this method for
   * handling normal response from removeSipReason operation
   */
  public void receiveResultremoveSipReason(
      openscape_voice.Openscape_voiceStub.RemoveSipReasonResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeSipReason operation
   */
  public void receiveErrorremoveSipReason(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getAuthCodeList method override this method for
   * handling normal response from getAuthCodeList operation
   */
  public void receiveResultgetAuthCodeList(
      openscape_voice.Openscape_voiceStub.GetAuthCodeListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getAuthCodeList operation
   */
  public void receiveErrorgetAuthCodeList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteGToGCACPolicy method override this method for
   * handling normal response from deleteGToGCACPolicy operation
   */
  public void receiveResultdeleteGToGCACPolicy(
      openscape_voice.Openscape_voiceStub.DeleteGToGCACPolicyResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteGToGCACPolicy operation
   */
  public void receiveErrordeleteGToGCACPolicy(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryBcastGroup method override this method for
   * handling normal response from queryBcastGroup operation
   */
  public void receiveResultqueryBcastGroup(
      openscape_voice.Openscape_voiceStub.QueryBcastGroupResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryBcastGroup operation
   */
  public void receiveErrorqueryBcastGroup(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createEAGroup method override this method for
   * handling normal response from createEAGroup operation
   */
  public void receiveResultcreateEAGroup(
      openscape_voice.Openscape_voiceStub.CreateEAGroupResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createEAGroup operation
   */
  public void receiveErrorcreateEAGroup(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getLicensingInfo method override this method for
   * handling normal response from getLicensingInfo operation
   */
  public void receiveResultgetLicensingInfo(
      openscape_voice.Openscape_voiceStub.GetLicensingInfoResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getLicensingInfo operation
   */
  public void receiveErrorgetLicensingInfo(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getDestCode method override this method for handling
   * normal response from getDestCode operation
   */
  public void receiveResultgetDestCode(
      openscape_voice.Openscape_voiceStub.GetDestCodeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getDestCode operation
   */
  public void receiveErrorgetDestCode(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyPeriodSchedule method override this method for
   * handling normal response from modifyPeriodSchedule operation
   */
  public void receiveResultmodifyPeriodSchedule(
      openscape_voice.Openscape_voiceStub.ModifyPeriodScheduleResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyPeriodSchedule operation
   */
  public void receiveErrormodifyPeriodSchedule(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for listOperatorEnum method override this method for
   * handling normal response from listOperatorEnum operation
   */
  public void receiveResultlistOperatorEnum(
      openscape_voice.Openscape_voiceStub.ListOperatorEnumResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * listOperatorEnum operation
   */
  public void receiveErrorlistOperatorEnum(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getLogServer method override this method for handling
   * normal response from getLogServer operation
   */
  public void receiveResultgetLogServer(
      openscape_voice.Openscape_voiceStub.GetLogServerResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getLogServer operation
   */
  public void receiveErrorgetLogServer(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getPrefixAccessCodeOne2 method override this method
   * for handling normal response from getPrefixAccessCodeOne2 operation
   */
  public void receiveResultgetPrefixAccessCodeOne2(
      openscape_voice.Openscape_voiceStub.PrefixAccessCodeOneResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getPrefixAccessCodeOne2 operation
   */
  public void receiveErrorgetPrefixAccessCodeOne2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createCOR method override this method for handling
   * normal response from createCOR operation
   */
  public void receiveResultcreateCOR(openscape_voice.Openscape_voiceStub.CreateCORResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createCOR operation
   */
  public void receiveErrorcreateCOR(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deActivateContTrc method override this method for
   * handling normal response from deActivateContTrc operation
   */
  public void receiveResultdeActivateContTrc(
      openscape_voice.Openscape_voiceStub.DeActiveateContTrcRes result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deActivateContTrc operation
   */
  public void receiveErrordeActivateContTrc(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getBgSubnetAndLinList method override this method for
   * handling normal response from getBgSubnetAndLinList operation
   */
  public void receiveResultgetBgSubnetAndLinList(
      openscape_voice.Openscape_voiceStub.GetBgSubnetAndLinListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getBgSubnetAndLinList operation
   */
  public void receiveErrorgetBgSubnetAndLinList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateBGParms2 method override this method for
   * handling normal response from updateBGParms2 operation
   */
  public void receiveResultupdateBGParms2(
      openscape_voice.Openscape_voiceStub.UpdateBGParmsResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateBGParms2 operation
   */
  public void receiveErrorupdateBGParms2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createPnpLocationCode2 method override this method
   * for handling normal response from createPnpLocationCode2 operation
   */
  public void receiveResultcreatePnpLocationCode2(
      openscape_voice.Openscape_voiceStub.PnpLocationCodeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createPnpLocationCode2 operation
   */
  public void receiveErrorcreatePnpLocationCode2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryTrunk method override this method for handling
   * normal response from queryTrunk operation
   */
  public void receiveResultqueryTrunk(
      openscape_voice.Openscape_voiceStub.QueryTrunkResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryTrunk operation
   */
  public void receiveErrorqueryTrunk(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getCSTAApplicationList method override this method
   * for handling normal response from getCSTAApplicationList operation
   */
  public void receiveResultgetCSTAApplicationList(
      openscape_voice.Openscape_voiceStub.GetCSTAApplicationListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getCSTAApplicationList operation
   */
  public void receiveErrorgetCSTAApplicationList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getTombStoneSubscriberList method override this
   * method for handling normal response from getTombStoneSubscriberList operation
   */
  public void receiveResultgetTombStoneSubscriberList(
      openscape_voice.Openscape_voiceStub.GetTombStoneSubscriberListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getTombStoneSubscriberList operation
   */
  public void receiveErrorgetTombStoneSubscriberList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for addSipTrustedEntityPorts method override this method
   * for handling normal response from addSipTrustedEntityPorts operation
   */
  public void receiveResultaddSipTrustedEntityPorts(
      openscape_voice.Openscape_voiceStub.SipTrustedEntityPortsResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * addSipTrustedEntityPorts operation
   */
  public void receiveErroraddSipTrustedEntityPorts(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getMlhgTMData method override this method for
   * handling normal response from getMlhgTMData operation
   */
  public void receiveResultgetMlhgTMData(
      openscape_voice.Openscape_voiceStub.GetMlhgTMDataResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getMlhgTMData operation
   */
  public void receiveErrorgetMlhgTMData(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeEnumServer method override this method for
   * handling normal response from removeEnumServer operation
   */
  public void receiveResultremoveEnumServer(
      openscape_voice.Openscape_voiceStub.RemoveEnumServerResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeEnumServer operation
   */
  public void receiveErrorremoveEnumServer(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getLicenseUsageData method override this method for
   * handling normal response from getLicenseUsageData operation
   */
  public void receiveResultgetLicenseUsageData(
      openscape_voice.Openscape_voiceStub.GetLicenseUsageDataResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getLicenseUsageData operation
   */
  public void receiveErrorgetLicenseUsageData(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteEAGroupMember method override this method for
   * handling normal response from deleteEAGroupMember operation
   */
  public void receiveResultdeleteEAGroupMember(
      openscape_voice.Openscape_voiceStub.DeleteEAGroupMemberResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteEAGroupMember operation
   */
  public void receiveErrordeleteEAGroupMember(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for upgradeSecondNode method override this method for
   * handling normal response from upgradeSecondNode operation
   */
  public void receiveResultupgradeSecondNode(
      openscape_voice.Openscape_voiceStub.UpgradeSecondNodeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * upgradeSecondNode operation
   */
  public void receiveErrorupgradeSecondNode(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeRateArea method override this method for
   * handling normal response from removeRateArea operation
   */
  public void receiveResultremoveRateArea(
      openscape_voice.Openscape_voiceStub.RemoveRateAreaResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeRateArea operation
   */
  public void receiveErrorremoveRateArea(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryDnmLocalToll method override this method for
   * handling normal response from queryDnmLocalToll operation
   */
  public void receiveResultqueryDnmLocalToll(
      openscape_voice.Openscape_voiceStub.QueryDnmLocalTollResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryDnmLocalToll operation
   */
  public void receiveErrorqueryDnmLocalToll(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyPFR method override this method for handling
   * normal response from modifyPFR operation
   */
  public void receiveResultmodifyPFR(openscape_voice.Openscape_voiceStub.ModifyPFRResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyPFR operation
   */
  public void receiveErrormodifyPFR(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getCSTASMInfo method override this method for
   * handling normal response from getCSTASMInfo operation
   */
  public void receiveResultgetCSTASMInfo(
      openscape_voice.Openscape_voiceStub.GetCSTASMInfoResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getCSTASMInfo operation
   */
  public void receiveErrorgetCSTASMInfo(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryDnmConversion method override this method for
   * handling normal response from queryDnmConversion operation
   */
  public void receiveResultqueryDnmConversion(
      openscape_voice.Openscape_voiceStub.QueryDnmConversionResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryDnmConversion operation
   */
  public void receiveErrorqueryDnmConversion(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getAncestorTreeForCACGroup method override this
   * method for handling normal response from getAncestorTreeForCACGroup operation
   */
  public void receiveResultgetAncestorTreeForCACGroup(
      openscape_voice.Openscape_voiceStub.GetAncestorTreeForCACGroupResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getAncestorTreeForCACGroup operation
   */
  public void receiveErrorgetAncestorTreeForCACGroup(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getInterceptList method override this method for
   * handling normal response from getInterceptList operation
   */
  public void receiveResultgetInterceptList(
      openscape_voice.Openscape_voiceStub.GetInterceptListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getInterceptList operation
   */
  public void receiveErrorgetInterceptList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryMediaGateway method override this method for
   * handling normal response from queryMediaGateway operation
   */
  public void receiveResultqueryMediaGateway(
      openscape_voice.Openscape_voiceStub.MediaGatewayResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryMediaGateway operation
   */
  public void receiveErrorqueryMediaGateway(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteDatabaseJob method override this method for
   * handling normal response from deleteDatabaseJob operation
   */
  public void receiveResultdeleteDatabaseJob(
      openscape_voice.Openscape_voiceStub.DatabaseJobResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteDatabaseJob operation
   */
  public void receiveErrordeleteDatabaseJob(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyLocalCpuMembers method override this method for
   * handling normal response from modifyLocalCpuMembers operation
   */
  public void receiveResultmodifyLocalCpuMembers(
      openscape_voice.Openscape_voiceStub.ModifyLocalCpuMembersResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyLocalCpuMembers operation
   */
  public void receiveErrormodifyLocalCpuMembers(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getRateAreaList method override this method for
   * handling normal response from getRateAreaList operation
   */
  public void receiveResultgetRateAreaList(
      openscape_voice.Openscape_voiceStub.GetRateAreaListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getRateAreaList operation
   */
  public void receiveErrorgetRateAreaList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createMlhgTerm2 method override this method for
   * handling normal response from createMlhgTerm2 operation
   */
  public void receiveResultcreateMlhgTerm2(
      openscape_voice.Openscape_voiceStub.MlhgTermResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createMlhgTerm2 operation
   */
  public void receiveErrorcreateMlhgTerm2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getTotalCPUCountUsed method override this method for
   * handling normal response from getTotalCPUCountUsed operation
   */
  public void receiveResultgetTotalCPUCountUsed(
      openscape_voice.Openscape_voiceStub.GetTotalCPUCountUsedResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getTotalCPUCountUsed operation
   */
  public void receiveErrorgetTotalCPUCountUsed(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getBGAttendantNumbers2 method override this method
   * for handling normal response from getBGAttendantNumbers2 operation
   */
  public void receiveResultgetBGAttendantNumbers2(
      openscape_voice.Openscape_voiceStub.BGAttendantNumberListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getBGAttendantNumbers2 operation
   */
  public void receiveErrorgetBGAttendantNumbers2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for activateContTrc method override this method for
   * handling normal response from activateContTrc operation
   */
  public void receiveResultactivateContTrc(
      openscape_voice.Openscape_voiceStub.ActiveateContTrcRes result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * activateContTrc operation
   */
  public void receiveErroractivateContTrc(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createDnmConversion method override this method for
   * handling normal response from createDnmConversion operation
   */
  public void receiveResultcreateDnmConversion(
      openscape_voice.Openscape_voiceStub.CreateDnmConversionResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createDnmConversion operation
   */
  public void receiveErrorcreateDnmConversion(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for notifyCACPrimaryLinkStatus method override this
   * method for handling normal response from notifyCACPrimaryLinkStatus operation
   */
  public void receiveResultnotifyCACPrimaryLinkStatus(
      openscape_voice.Openscape_voiceStub.NotifyCACPrimaryLinkStatusResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * notifyCACPrimaryLinkStatus operation
   */
  public void receiveErrornotifyCACPrimaryLinkStatus(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getSubTranStatus method override this method for
   * handling normal response from getSubTranStatus operation
   */
  public void receiveResultgetSubTranStatus(
      openscape_voice.Openscape_voiceStub.GetSubTranStatusResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getSubTranStatus operation
   */
  public void receiveErrorgetSubTranStatus(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for translateDialedDigits method override this method for
   * handling normal response from translateDialedDigits operation
   */
  public void receiveResulttranslateDialedDigits(
      openscape_voice.Openscape_voiceStub.TranslateDialedDigitsResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * translateDialedDigits operation
   */
  public void receiveErrortranslateDialedDigits(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryServiceGroupMembers method override this method
   * for handling normal response from queryServiceGroupMembers operation
   */
  public void receiveResultqueryServiceGroupMembers(
      openscape_voice.Openscape_voiceStub.QueryServiceGroupMembersResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryServiceGroupMembers operation
   */
  public void receiveErrorqueryServiceGroupMembers(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getAssociatedSipEndpointList method override this
   * method for handling normal response from getAssociatedSipEndpointList operation
   */
  public void receiveResultgetAssociatedSipEndpointList(
      openscape_voice.Openscape_voiceStub.GetAssociatedSipEndpointListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getAssociatedSipEndpointList operation
   */
  public void receiveErrorgetAssociatedSipEndpointList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteDomainCode method override this method for
   * handling normal response from deleteDomainCode operation
   */
  public void receiveResultdeleteDomainCode(
      openscape_voice.Openscape_voiceStub.DeleteDomainCodeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteDomainCode operation
   */
  public void receiveErrordeleteDomainCode(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyOfficeCode method override this method for
   * handling normal response from modifyOfficeCode operation
   */
  public void receiveResultmodifyOfficeCode(
      openscape_voice.Openscape_voiceStub.ModifyOfficeCodeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyOfficeCode operation
   */
  public void receiveErrormodifyOfficeCode(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createBranchOffice method override this method for
   * handling normal response from createBranchOffice operation
   */
  public void receiveResultcreateBranchOffice(
      openscape_voice.Openscape_voiceStub.CreateBranchOfficeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createBranchOffice operation
   */
  public void receiveErrorcreateBranchOffice(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyRemoteCpuGroups method override this method for
   * handling normal response from modifyRemoteCpuGroups operation
   */
  public void receiveResultmodifyRemoteCpuGroups(
      openscape_voice.Openscape_voiceStub.ModifyRemoteCpuGroupsResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyRemoteCpuGroups operation
   */
  public void receiveErrormodifyRemoteCpuGroups(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createEAGroupMemberAuxLine method override this
   * method for handling normal response from createEAGroupMemberAuxLine operation
   */
  public void receiveResultcreateEAGroupMemberAuxLine(
      openscape_voice.Openscape_voiceStub.CreateEAGroupMemberAuxLineResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createEAGroupMemberAuxLine operation
   */
  public void receiveErrorcreateEAGroupMemberAuxLine(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getProvisionedCACPrimaryLinks method override this
   * method for handling normal response from getProvisionedCACPrimaryLinks operation
   */
  public void receiveResultgetProvisionedCACPrimaryLinks(
      openscape_voice.Openscape_voiceStub.GetProvisionedCACPrimaryLinksResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getProvisionedCACPrimaryLinks operation
   */
  public void receiveErrorgetProvisionedCACPrimaryLinks(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getQEWhiteList method override this method for
   * handling normal response from getQEWhiteList operation
   */
  public void receiveResultgetQEWhiteList(
      openscape_voice.Openscape_voiceStub.GetQEWhiteListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getQEWhiteList operation
   */
  public void receiveErrorgetQEWhiteList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyCommunityGroupMember method override this
   * method for handling normal response from modifyCommunityGroupMember operation
   */
  public void receiveResultmodifyCommunityGroupMember(
      openscape_voice.Openscape_voiceStub.ModifyCommunityGroupMemberResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyCommunityGroupMember operation
   */
  public void receiveErrormodifyCommunityGroupMember(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for addCommunityGroup method override this method for
   * handling normal response from addCommunityGroup operation
   */
  public void receiveResultaddCommunityGroup(
      openscape_voice.Openscape_voiceStub.AddCommunityGroupResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * addCommunityGroup operation
   */
  public void receiveErroraddCommunityGroup(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createFeatureProfile2 method override this method for
   * handling normal response from createFeatureProfile2 operation
   */
  public void receiveResultcreateFeatureProfile2(
      openscape_voice.Openscape_voiceStub.CreateFeatureProfileResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createFeatureProfile2 operation
   */
  public void receiveErrorcreateFeatureProfile2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getSipTrustedEntityPortsList method override this
   * method for handling normal response from getSipTrustedEntityPortsList operation
   */
  public void receiveResultgetSipTrustedEntityPortsList(
      openscape_voice.Openscape_voiceStub.GetSipTrustedEntityPortsListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getSipTrustedEntityPortsList operation
   */
  public void receiveErrorgetSipTrustedEntityPortsList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteFeatureProfile2 method override this method for
   * handling normal response from deleteFeatureProfile2 operation
   */
  public void receiveResultdeleteFeatureProfile2(
      openscape_voice.Openscape_voiceStub.DeleteFeatureProfileResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteFeatureProfile2 operation
   */
  public void receiveErrordeleteFeatureProfile2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createSubscriber2 method override this method for
   * handling normal response from createSubscriber2 operation
   */
  public void receiveResultcreateSubscriber2(
      openscape_voice.Openscape_voiceStub.CreateSubscriberResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createSubscriber2 operation
   */
  public void receiveErrorcreateSubscriber2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryTimeDestination method override this method for
   * handling normal response from queryTimeDestination operation
   */
  public void receiveResultqueryTimeDestination(
      openscape_voice.Openscape_voiceStub.TimeDestinationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryTimeDestination operation
   */
  public void receiveErrorqueryTimeDestination(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryOfficeCode method override this method for
   * handling normal response from queryOfficeCode operation
   */
  public void receiveResultqueryOfficeCode(
      openscape_voice.Openscape_voiceStub.OfficeCodeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryOfficeCode operation
   */
  public void receiveErrorqueryOfficeCode(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyCOR method override this method for handling
   * normal response from modifyCOR operation
   */
  public void receiveResultmodifyCOR(openscape_voice.Openscape_voiceStub.ModifyCORResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyCOR operation
   */
  public void receiveErrormodifyCOR(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createDnmPrefix method override this method for
   * handling normal response from createDnmPrefix operation
   */
  public void receiveResultcreateDnmPrefix(
      openscape_voice.Openscape_voiceStub.CreateDnmPrefixResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createDnmPrefix operation
   */
  public void receiveErrorcreateDnmPrefix(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createOriginDestination method override this method
   * for handling normal response from createOriginDestination operation
   */
  public void receiveResultcreateOriginDestination(
      openscape_voice.Openscape_voiceStub.CreateOriginDestinationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createOriginDestination operation
   */
  public void receiveErrorcreateOriginDestination(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createAuthCode method override this method for
   * handling normal response from createAuthCode operation
   */
  public void receiveResultcreateAuthCode(
      openscape_voice.Openscape_voiceStub.AuthCodeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createAuthCode operation
   */
  public void receiveErrorcreateAuthCode(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeLinPool method override this method for
   * handling normal response from removeLinPool operation
   */
  public void receiveResultremoveLinPool(
      openscape_voice.Openscape_voiceStub.RemoveLinPoolResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeLinPool operation
   */
  public void receiveErrorremoveLinPool(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getCpuGroupMemberList method override this method for
   * handling normal response from getCpuGroupMemberList operation
   */
  public void receiveResultgetCpuGroupMemberList(
      openscape_voice.Openscape_voiceStub.GetCpuGroupMemberListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getCpuGroupMemberList operation
   */
  public void receiveErrorgetCpuGroupMemberList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyRateArea method override this method for
   * handling normal response from modifyRateArea operation
   */
  public void receiveResultmodifyRateArea(
      openscape_voice.Openscape_voiceStub.ModifyRateAreaResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyRateArea operation
   */
  public void receiveErrormodifyRateArea(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for translationVerify method override this method for
   * handling normal response from translationVerify operation
   */
  public void receiveResulttranslationVerify(
      openscape_voice.Openscape_voiceStub.TransVerifyResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * translationVerify operation
   */
  public void receiveErrortranslationVerify(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateSubscriberBGInfo2 method override this method
   * for handling normal response from updateSubscriberBGInfo2 operation
   */
  public void receiveResultupdateSubscriberBGInfo2(
      openscape_voice.Openscape_voiceStub.UpdateSubscriberBGInfoResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateSubscriberBGInfo2 operation
   */
  public void receiveErrorupdateSubscriberBGInfo2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for addBGMainNumber2 method override this method for
   * handling normal response from addBGMainNumber2 operation
   */
  public void receiveResultaddBGMainNumber2(
      openscape_voice.Openscape_voiceStub.AddBGMainNumberResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * addBGMainNumber2 operation
   */
  public void receiveErroraddBGMainNumber2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createEndpoint method override this method for
   * handling normal response from createEndpoint operation
   */
  public void receiveResultcreateEndpoint(
      openscape_voice.Openscape_voiceStub.CreateEndpointResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createEndpoint operation
   */
  public void receiveErrorcreateEndpoint(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeBcastMembers method override this method for
   * handling normal response from removeBcastMembers operation
   */
  public void receiveResultremoveBcastMembers(
      openscape_voice.Openscape_voiceStub.RemoveBcastMembersResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeBcastMembers operation
   */
  public void receiveErrorremoveBcastMembers(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deletePatchsetFiles method override this method for
   * handling normal response from deletePatchsetFiles operation
   */
  public void receiveResultdeletePatchsetFiles(
      openscape_voice.Openscape_voiceStub.DeletePatchsetFilesResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deletePatchsetFiles operation
   */
  public void receiveErrordeletePatchsetFiles(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getPnPLocationCodeList2 method override this method
   * for handling normal response from getPnPLocationCodeList2 operation
   */
  public void receiveResultgetPnPLocationCodeList2(
      openscape_voice.Openscape_voiceStub.PnpLocationCodeListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getPnPLocationCodeList2 operation
   */
  public void receiveErrorgetPnPLocationCodeList2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for refreshServiceGroupMember method override this method
   * for handling normal response from refreshServiceGroupMember operation
   */
  public void receiveResultrefreshServiceGroupMember(
      openscape_voice.Openscape_voiceStub.RefreshServiceGroupMemberResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * refreshServiceGroupMember operation
   */
  public void receiveErrorrefreshServiceGroupMember(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getOsbSyncData method override this method for
   * handling normal response from getOsbSyncData operation
   */
  public void receiveResultgetOsbSyncData(
      openscape_voice.Openscape_voiceStub.GetOsbSyncDataResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getOsbSyncData operation
   */
  public void receiveErrorgetOsbSyncData(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeTimeDestination method override this method for
   * handling normal response from removeTimeDestination operation
   */
  public void receiveResultremoveTimeDestination(
      openscape_voice.Openscape_voiceStub.RemoveTimeDestinationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeTimeDestination operation
   */
  public void receiveErrorremoveTimeDestination(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createMediaGateway method override this method for
   * handling normal response from createMediaGateway operation
   */
  public void receiveResultcreateMediaGateway(
      openscape_voice.Openscape_voiceStub.CreateMediaGatewayResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createMediaGateway operation
   */
  public void receiveErrorcreateMediaGateway(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for feClientSubscription method override this method for
   * handling normal response from feClientSubscription operation
   */
  public void receiveResultfeClientSubscription(
      openscape_voice.Openscape_voiceStub.FeClientSubscriptionResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * feClientSubscription operation
   */
  public void receiveErrorfeClientSubscription(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getDBVersionInfo method override this method for
   * handling normal response from getDBVersionInfo operation
   */
  public void receiveResultgetDBVersionInfo(
      openscape_voice.Openscape_voiceStub.GetDBVersionInfoResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getDBVersionInfo operation
   */
  public void receiveErrorgetDBVersionInfo(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateQEWhiteList method override this method for
   * handling normal response from updateQEWhiteList operation
   */
  public void receiveResultupdateQEWhiteList(
      openscape_voice.Openscape_voiceStub.UpdateQEWhiteListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateQEWhiteList operation
   */
  public void receiveErrorupdateQEWhiteList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getLogClient method override this method for handling
   * normal response from getLogClient operation
   */
  public void receiveResultgetLogClient(
      openscape_voice.Openscape_voiceStub.GetLogClientResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getLogClient operation
   */
  public void receiveErrorgetLogClient(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for resetGlobalCACPolicyThresholds method override this
   * method for handling normal response from resetGlobalCACPolicyThresholds operation
   */
  public void receiveResultresetGlobalCACPolicyThresholds(
      openscape_voice.Openscape_voiceStub.ResetGlobalCACPolicyThresholdsResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * resetGlobalCACPolicyThresholds operation
   */
  public void receiveErrorresetGlobalCACPolicyThresholds(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyOperatorEnum method override this method for
   * handling normal response from modifyOperatorEnum operation
   */
  public void receiveResultmodifyOperatorEnum(
      openscape_voice.Openscape_voiceStub.ModifyOperatorEnumResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyOperatorEnum operation
   */
  public void receiveErrormodifyOperatorEnum(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getBGList3 method override this method for handling
   * normal response from getBGList3 operation
   */
  public void receiveResultgetBGList3(
      openscape_voice.Openscape_voiceStub.GetBGListResultEnhanced result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getBGList3 operation
   */
  public void receiveErrorgetBGList3(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getCallingLocationList2 method override this method
   * for handling normal response from getCallingLocationList2 operation
   */
  public void receiveResultgetCallingLocationList2(
      openscape_voice.Openscape_voiceStub.GetCallingLocationListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getCallingLocationList2 operation
   */
  public void receiveErrorgetCallingLocationList2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryLocationService method override this method for
   * handling normal response from queryLocationService operation
   */
  public void receiveResultqueryLocationService(
      openscape_voice.Openscape_voiceStub.QueryLocationServiceResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryLocationService operation
   */
  public void receiveErrorqueryLocationService(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getBGList2 method override this method for handling
   * normal response from getBGList2 operation
   */
  public void receiveResultgetBGList2(openscape_voice.Openscape_voiceStub.GetBGListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getBGList2 operation
   */
  public void receiveErrorgetBGList2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createOfficeCode method override this method for
   * handling normal response from createOfficeCode operation
   */
  public void receiveResultcreateOfficeCode(
      openscape_voice.Openscape_voiceStub.CreateOfficeCodeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createOfficeCode operation
   */
  public void receiveErrorcreateOfficeCode(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for cancelFileSystemBackup method override this method
   * for handling normal response from cancelFileSystemBackup operation
   */
  public void receiveResultcancelFileSystemBackup(
      openscape_voice.Openscape_voiceStub.CancelFSBackupResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * cancelFileSystemBackup operation
   */
  public void receiveErrorcancelFileSystemBackup(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateEACockpitDynamicData method override this
   * method for handling normal response from updateEACockpitDynamicData operation
   */
  public void receiveResultupdateEACockpitDynamicData(
      openscape_voice.Openscape_voiceStub.UpdateEACockpitDynamicDataResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateEACockpitDynamicData operation
   */
  public void receiveErrorupdateEACockpitDynamicData(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for demoGetStatus method override this method for
   * handling normal response from demoGetStatus operation
   */
  public void receiveResultdemoGetStatus(
      openscape_voice.Openscape_voiceStub.DemoGetStatusResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * demoGetStatus operation
   */
  public void receiveErrordemoGetStatus(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for unassignDaySchedule method override this method for
   * handling normal response from unassignDaySchedule operation
   */
  public void receiveResultunassignDaySchedule(
      openscape_voice.Openscape_voiceStub.UnassignDayScheduleResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * unassignDaySchedule operation
   */
  public void receiveErrorunassignDaySchedule(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createBgSubnet2 method override this method for
   * handling normal response from createBgSubnet2 operation
   */
  public void receiveResultcreateBgSubnet2(
      openscape_voice.Openscape_voiceStub.CreateBgSubnetResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createBgSubnet2 operation
   */
  public void receiveErrorcreateBgSubnet2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createPeriodSchedule method override this method for
   * handling normal response from createPeriodSchedule operation
   */
  public void receiveResultcreatePeriodSchedule(
      openscape_voice.Openscape_voiceStub.CreatePeriodScheduleResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createPeriodSchedule operation
   */
  public void receiveErrorcreatePeriodSchedule(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteLogServer method override this method for
   * handling normal response from deleteLogServer operation
   */
  public void receiveResultdeleteLogServer(
      openscape_voice.Openscape_voiceStub.DeleteLogServerResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteLogServer operation
   */
  public void receiveErrordeleteLogServer(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryCORNamesList method override this method for
   * handling normal response from queryCORNamesList operation
   */
  public void receiveResultqueryCORNamesList(
      openscape_voice.Openscape_voiceStub.QueryCORNamesListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryCORNamesList operation
   */
  public void receiveErrorqueryCORNamesList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createServiceGroup method override this method for
   * handling normal response from createServiceGroup operation
   */
  public void receiveResultcreateServiceGroup(
      openscape_voice.Openscape_voiceStub.CreateServiceGroupResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createServiceGroup operation
   */
  public void receiveErrorcreateServiceGroup(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyEndpointLocation method override this method
   * for handling normal response from modifyEndpointLocation operation
   */
  public void receiveResultmodifyEndpointLocation(
      openscape_voice.Openscape_voiceStub.ModifyEndpointLocationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyEndpointLocation operation
   */
  public void receiveErrormodifyEndpointLocation(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for listCodeProcess method override this method for
   * handling normal response from listCodeProcess operation
   */
  public void receiveResultlistCodeProcess(
      openscape_voice.Openscape_voiceStub.CodeProcessListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * listCodeProcess operation
   */
  public void receiveErrorlistCodeProcess(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getEACockpitConfigData method override this method
   * for handling normal response from getEACockpitConfigData operation
   */
  public void receiveResultgetEACockpitConfigData(
      openscape_voice.Openscape_voiceStub.GetEACockpitConfigDataResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getEACockpitConfigData operation
   */
  public void receiveErrorgetEACockpitConfigData(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for listEnumServer method override this method for
   * handling normal response from listEnumServer operation
   */
  public void receiveResultlistEnumServer(
      openscape_voice.Openscape_voiceStub.ListEnumServerResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * listEnumServer operation
   */
  public void receiveErrorlistEnumServer(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getNodeHealth method override this method for
   * handling normal response from getNodeHealth operation
   */
  public void receiveResultgetNodeHealth(
      openscape_voice.Openscape_voiceStub.GetNodeInfoResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getNodeHealth operation
   */
  public void receiveErrorgetNodeHealth(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for setElementState method override this method for
   * handling normal response from setElementState operation
   */
  public void receiveResultsetElementState(
      openscape_voice.Openscape_voiceStub.SetElementStateResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * setElementState operation
   */
  public void receiveErrorsetElementState(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getMlhgInfo2 method override this method for handling
   * normal response from getMlhgInfo2 operation
   */
  public void receiveResultgetMlhgInfo2(
      openscape_voice.Openscape_voiceStub.GetMlhgInfoResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getMlhgInfo2 operation
   */
  public void receiveErrorgetMlhgInfo2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for addCpuGroup method override this method for handling
   * normal response from addCpuGroup operation
   */
  public void receiveResultaddCpuGroup(
      openscape_voice.Openscape_voiceStub.AddCpuGroupResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * addCpuGroup operation
   */
  public void receiveErroraddCpuGroup(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateEAGroupInfo method override this method for
   * handling normal response from updateEAGroupInfo operation
   */
  public void receiveResultupdateEAGroupInfo(
      openscape_voice.Openscape_voiceStub.UpdateEAGroupInfoResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateEAGroupInfo operation
   */
  public void receiveErrorupdateEAGroupInfo(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteClientFE method override this method for
   * handling normal response from deleteClientFE operation
   */
  public void receiveResultdeleteClientFE(
      openscape_voice.Openscape_voiceStub.DeleteClientFEResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteClientFE operation
   */
  public void receiveErrordeleteClientFE(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyEsrpQueue method override this method for
   * handling normal response from modifyEsrpQueue operation
   */
  public void receiveResultmodifyEsrpQueue(
      openscape_voice.Openscape_voiceStub.ModifyEsrpQueueResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyEsrpQueue operation
   */
  public void receiveErrormodifyEsrpQueue(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryCallingLocation method override this method for
   * handling normal response from queryCallingLocation operation
   */
  public void receiveResultqueryCallingLocation(
      openscape_voice.Openscape_voiceStub.CallingLocationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryCallingLocation operation
   */
  public void receiveErrorqueryCallingLocation(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removePeriodSchedule method override this method for
   * handling normal response from removePeriodSchedule operation
   */
  public void receiveResultremovePeriodSchedule(
      openscape_voice.Openscape_voiceStub.RemovePeriodScheduleResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removePeriodSchedule operation
   */
  public void receiveErrorremovePeriodSchedule(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeOperatorEnum method override this method for
   * handling normal response from removeOperatorEnum operation
   */
  public void receiveResultremoveOperatorEnum(
      openscape_voice.Openscape_voiceStub.RemoveOperatorEnumResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeOperatorEnum operation
   */
  public void receiveErrorremoveOperatorEnum(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryClientFEs method override this method for
   * handling normal response from queryClientFEs operation
   */
  public void receiveResultqueryClientFEs(
      openscape_voice.Openscape_voiceStub.QueryClientFEsResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryClientFEs operation
   */
  public void receiveErrorqueryClientFEs(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for upgrade method override this method for handling
   * normal response from upgrade operation
   */
  public void receiveResultupgrade(openscape_voice.Openscape_voiceStub.UpgradeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * upgrade operation
   */
  public void receiveErrorupgrade(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryDestination method override this method for
   * handling normal response from queryDestination operation
   */
  public void receiveResultqueryDestination(
      openscape_voice.Openscape_voiceStub.GenericDestinationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryDestination operation
   */
  public void receiveErrorqueryDestination(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for prioritizeTreatment method override this method for
   * handling normal response from prioritizeTreatment operation
   */
  public void receiveResultprioritizeTreatment(
      openscape_voice.Openscape_voiceStub.PrioritizeTreatmentResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * prioritizeTreatment operation
   */
  public void receiveErrorprioritizeTreatment(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createEndpointProvider method override this method
   * for handling normal response from createEndpointProvider operation
   */
  public void receiveResultcreateEndpointProvider(
      openscape_voice.Openscape_voiceStub.CreateEndpointProviderResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createEndpointProvider operation
   */
  public void receiveErrorcreateEndpointProvider(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeOriginRoute method override this method for
   * handling normal response from removeOriginRoute operation
   */
  public void receiveResultremoveOriginRoute(
      openscape_voice.Openscape_voiceStub.RemoveOriginRouteResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeOriginRoute operation
   */
  public void receiveErrorremoveOriginRoute(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyOriginRoute method override this method for
   * handling normal response from modifyOriginRoute operation
   */
  public void receiveResultmodifyOriginRoute(
      openscape_voice.Openscape_voiceStub.ModifyOriginRouteResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyOriginRoute operation
   */
  public void receiveErrormodifyOriginRoute(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryEndpoint method override this method for
   * handling normal response from queryEndpoint operation
   */
  public void receiveResultqueryEndpoint(
      openscape_voice.Openscape_voiceStub.EndpointResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryEndpoint operation
   */
  public void receiveErrorqueryEndpoint(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createLocationService method override this method for
   * handling normal response from createLocationService operation
   */
  public void receiveResultcreateLocationService(
      openscape_voice.Openscape_voiceStub.CreateLocationServiceResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createLocationService operation
   */
  public void receiveErrorcreateLocationService(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for checkLostStatus method override this method for
   * handling normal response from checkLostStatus operation
   */
  public void receiveResultcheckLostStatus(
      openscape_voice.Openscape_voiceStub.CheckLostStatusResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * checkLostStatus operation
   */
  public void receiveErrorcheckLostStatus(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteLocationService method override this method for
   * handling normal response from deleteLocationService operation
   */
  public void receiveResultdeleteLocationService(
      openscape_voice.Openscape_voiceStub.DeleteLocationServiceResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteLocationService operation
   */
  public void receiveErrordeleteLocationService(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createTrunk method override this method for handling
   * normal response from createTrunk operation
   */
  public void receiveResultcreateTrunk(
      openscape_voice.Openscape_voiceStub.CreateTrunkResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createTrunk operation
   */
  public void receiveErrorcreateTrunk(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryFileSystemBackup method override this method for
   * handling normal response from queryFileSystemBackup operation
   */
  public void receiveResultqueryFileSystemBackup(
      openscape_voice.Openscape_voiceStub.QueryFSBackupResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryFileSystemBackup operation
   */
  public void receiveErrorqueryFileSystemBackup(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryCORGroupKeyList method override this method for
   * handling normal response from queryCORGroupKeyList operation
   */
  public void receiveResultqueryCORGroupKeyList(
      openscape_voice.Openscape_voiceStub.QueryCORGroupKeyListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryCORGroupKeyList operation
   */
  public void receiveErrorqueryCORGroupKeyList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyCACGroup method override this method for
   * handling normal response from modifyCACGroup operation
   */
  public void receiveResultmodifyCACGroup(
      openscape_voice.Openscape_voiceStub.ModifyCACGroupResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyCACGroup operation
   */
  public void receiveErrormodifyCACGroup(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryEsrpPolicyList method override this method for
   * handling normal response from queryEsrpPolicyList operation
   */
  public void receiveResultqueryEsrpPolicyList(
      openscape_voice.Openscape_voiceStub.QueryEsrpPolicyListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryEsrpPolicyList operation
   */
  public void receiveErrorqueryEsrpPolicyList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for checkAliDBStatus method override this method for
   * handling normal response from checkAliDBStatus operation
   */
  public void receiveResultcheckAliDBStatus(
      openscape_voice.Openscape_voiceStub.CheckAliDBStatusResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * checkAliDBStatus operation
   */
  public void receiveErrorcheckAliDBStatus(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateMobileInfo method override this method for
   * handling normal response from updateMobileInfo operation
   */
  public void receiveResultupdateMobileInfo(
      openscape_voice.Openscape_voiceStub.UpdateMobileInfoResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateMobileInfo operation
   */
  public void receiveErrorupdateMobileInfo(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for resetAllCACPrimaryLinks method override this method
   * for handling normal response from resetAllCACPrimaryLinks operation
   */
  public void receiveResultresetAllCACPrimaryLinks(
      openscape_voice.Openscape_voiceStub.ResetAllCACPrimaryLinksResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * resetAllCACPrimaryLinks operation
   */
  public void receiveErrorresetAllCACPrimaryLinks(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getOSMOData method override this method for handling
   * normal response from getOSMOData operation
   */
  public void receiveResultgetOSMOData(
      openscape_voice.Openscape_voiceStub.GetOSMODataResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getOSMOData operation
   */
  public void receiveErrorgetOSMOData(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteDnmLocalTollExchangeCodes method override this
   * method for handling normal response from deleteDnmLocalTollExchangeCodes operation
   */
  public void receiveResultdeleteDnmLocalTollExchangeCodes(
      openscape_voice.Openscape_voiceStub.DeleteDnmLocalTollExchangeCodesResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteDnmLocalTollExchangeCodes operation
   */
  public void receiveErrordeleteDnmLocalTollExchangeCodes(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getDestServiceList method override this method for
   * handling normal response from getDestServiceList operation
   */
  public void receiveResultgetDestServiceList(
      openscape_voice.Openscape_voiceStub.GetDestServiceListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getDestServiceList operation
   */
  public void receiveErrorgetDestServiceList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteBG2 method override this method for handling
   * normal response from deleteBG2 operation
   */
  public void receiveResultdeleteBG2(openscape_voice.Openscape_voiceStub.DeleteBGResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteBG2 operation
   */
  public void receiveErrordeleteBG2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for stopFileExport method override this method for
   * handling normal response from stopFileExport operation
   */
  public void receiveResultstopFileExport(
      openscape_voice.Openscape_voiceStub.StopFileExportRes result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * stopFileExport operation
   */
  public void receiveErrorstopFileExport(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryCommunityGroupMember method override this method
   * for handling normal response from queryCommunityGroupMember operation
   */
  public void receiveResultqueryCommunityGroupMember(
      openscape_voice.Openscape_voiceStub.QueryCommunityGroupMemberResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryCommunityGroupMember operation
   */
  public void receiveErrorqueryCommunityGroupMember(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyDestCode2 method override this method for
   * handling normal response from modifyDestCode2 operation
   */
  public void receiveResultmodifyDestCode2(
      openscape_voice.Openscape_voiceStub.DestCodeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyDestCode2 operation
   */
  public void receiveErrormodifyDestCode2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeAlias method override this method for handling
   * normal response from removeAlias operation
   */
  public void receiveResultremoveAlias(
      openscape_voice.Openscape_voiceStub.RemoveAliasResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeAlias operation
   */
  public void receiveErrorremoveAlias(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateSubscriberAccountMgtInfo2 method override this
   * method for handling normal response from updateSubscriberAccountMgtInfo2 operation
   */
  public void receiveResultupdateSubscriberAccountMgtInfo2(
      openscape_voice.Openscape_voiceStub.UpdateSubscriberAccountMgtInfoResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateSubscriberAccountMgtInfo2 operation
   */
  public void receiveErrorupdateSubscriberAccountMgtInfo2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getEsrpPolicy method override this method for
   * handling normal response from getEsrpPolicy operation
   */
  public void receiveResultgetEsrpPolicy(
      openscape_voice.Openscape_voiceStub.GetEsrpPolicyResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getEsrpPolicy operation
   */
  public void receiveErrorgetEsrpPolicy(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryEsrpQueueList method override this method for
   * handling normal response from queryEsrpQueueList operation
   */
  public void receiveResultqueryEsrpQueueList(
      openscape_voice.Openscape_voiceStub.QueryEsrpQueueListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryEsrpQueueList operation
   */
  public void receiveErrorqueryEsrpQueueList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteServiceGroup method override this method for
   * handling normal response from deleteServiceGroup operation
   */
  public void receiveResultdeleteServiceGroup(
      openscape_voice.Openscape_voiceStub.DeleteServiceGroupResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteServiceGroup operation
   */
  public void receiveErrordeleteServiceGroup(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteBGMainNumber2 method override this method for
   * handling normal response from deleteBGMainNumber2 operation
   */
  public void receiveResultdeleteBGMainNumber2(
      openscape_voice.Openscape_voiceStub.DeleteBGMainNumberResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteBGMainNumber2 operation
   */
  public void receiveErrordeleteBGMainNumber2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getFeatureList2 method override this method for
   * handling normal response from getFeatureList2 operation
   */
  public void receiveResultgetFeatureList2(
      openscape_voice.Openscape_voiceStub.GetServiceFeatureListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getFeatureList2 operation
   */
  public void receiveErrorgetFeatureList2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeCodeProcess method override this method for
   * handling normal response from removeCodeProcess operation
   */
  public void receiveResultremoveCodeProcess(
      openscape_voice.Openscape_voiceStub.RemoveCodeProcessResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeCodeProcess operation
   */
  public void receiveErrorremoveCodeProcess(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createFileSystemBackup method override this method
   * for handling normal response from createFileSystemBackup operation
   */
  public void receiveResultcreateFileSystemBackup(
      openscape_voice.Openscape_voiceStub.CreateFSBackupResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createFileSystemBackup operation
   */
  public void receiveErrorcreateFileSystemBackup(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyPnpExtension2 method override this method for
   * handling normal response from modifyPnpExtension2 operation
   */
  public void receiveResultmodifyPnpExtension2(
      openscape_voice.Openscape_voiceStub.PnpExtensionResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyPnpExtension2 operation
   */
  public void receiveErrormodifyPnpExtension2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryMediaGatewayCircuits method override this method
   * for handling normal response from queryMediaGatewayCircuits operation
   */
  public void receiveResultqueryMediaGatewayCircuits(
      openscape_voice.Openscape_voiceStub.MediaGatewayCircuitsResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryMediaGatewayCircuits operation
   */
  public void receiveErrorqueryMediaGatewayCircuits(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deletePnpExtension2 method override this method for
   * handling normal response from deletePnpExtension2 operation
   */
  public void receiveResultdeletePnpExtension2(
      openscape_voice.Openscape_voiceStub.PnpExtensionResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deletePnpExtension2 operation
   */
  public void receiveErrordeletePnpExtension2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getNumberPlanIDInfo method override this method for
   * handling normal response from getNumberPlanIDInfo operation
   */
  public void receiveResultgetNumberPlanIDInfo(
      openscape_voice.Openscape_voiceStub.GetNumberPlanIDInfoResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getNumberPlanIDInfo operation
   */
  public void receiveErrorgetNumberPlanIDInfo(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyCodeProcess method override this method for
   * handling normal response from modifyCodeProcess operation
   */
  public void receiveResultmodifyCodeProcess(
      openscape_voice.Openscape_voiceStub.ModifyCodeProcessResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyCodeProcess operation
   */
  public void receiveErrormodifyCodeProcess(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createLostServer method override this method for
   * handling normal response from createLostServer operation
   */
  public void receiveResultcreateLostServer(
      openscape_voice.Openscape_voiceStub.CreateLostServerResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createLostServer operation
   */
  public void receiveErrorcreateLostServer(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryRoute method override this method for handling
   * normal response from queryRoute operation
   */
  public void receiveResultqueryRoute(
      openscape_voice.Openscape_voiceStub.QueryRouteResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryRoute operation
   */
  public void receiveErrorqueryRoute(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateSubscriberAccountUserInfo2 method override this
   * method for handling normal response from updateSubscriberAccountUserInfo2 operation
   */
  public void receiveResultupdateSubscriberAccountUserInfo2(
      openscape_voice.Openscape_voiceStub.UpdateSubscriberAccountUserInfoResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateSubscriberAccountUserInfo2 operation
   */
  public void receiveErrorupdateSubscriberAccountUserInfo2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteCACPolicy method override this method for
   * handling normal response from deleteCACPolicy operation
   */
  public void receiveResultdeleteCACPolicy(
      openscape_voice.Openscape_voiceStub.DeleteCACPolicyResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteCACPolicy operation
   */
  public void receiveErrordeleteCACPolicy(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createTimeDestination method override this method for
   * handling normal response from createTimeDestination operation
   */
  public void receiveResultcreateTimeDestination(
      openscape_voice.Openscape_voiceStub.CreateTimeDestinationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createTimeDestination operation
   */
  public void receiveErrorcreateTimeDestination(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyBGDept2 method override this method for
   * handling normal response from modifyBGDept2 operation
   */
  public void receiveResultmodifyBGDept2(
      openscape_voice.Openscape_voiceStub.ModifyBGDeptResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyBGDept2 operation
   */
  public void receiveErrormodifyBGDept2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for addSystemSipEntry method override this method for
   * handling normal response from addSystemSipEntry operation
   */
  public void receiveResultaddSystemSipEntry(
      openscape_voice.Openscape_voiceStub.SystemSipEntryResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * addSystemSipEntry operation
   */
  public void receiveErroraddSystemSipEntry(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for demoDisableFeatureSet method override this method for
   * handling normal response from demoDisableFeatureSet operation
   */
  public void receiveResultdemoDisableFeatureSet(
      openscape_voice.Openscape_voiceStub.DemoDisableFeatureSetResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * demoDisableFeatureSet operation
   */
  public void receiveErrordemoDisableFeatureSet(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for cancelDatabaseJob method override this method for
   * handling normal response from cancelDatabaseJob operation
   */
  public void receiveResultcancelDatabaseJob(
      openscape_voice.Openscape_voiceStub.DatabaseJobResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * cancelDatabaseJob operation
   */
  public void receiveErrorcancelDatabaseJob(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteSubscriber2 method override this method for
   * handling normal response from deleteSubscriber2 operation
   */
  public void receiveResultdeleteSubscriber2(
      openscape_voice.Openscape_voiceStub.DeleteSubscriberResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteSubscriber2 operation
   */
  public void receiveErrordeleteSubscriber2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createDnmNormalization method override this method
   * for handling normal response from createDnmNormalization operation
   */
  public void receiveResultcreateDnmNormalization(
      openscape_voice.Openscape_voiceStub.CreateDnmNormalizationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createDnmNormalization operation
   */
  public void receiveErrorcreateDnmNormalization(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeCACGroupAddr method override this method for
   * handling normal response from removeCACGroupAddr operation
   */
  public void receiveResultremoveCACGroupAddr(
      openscape_voice.Openscape_voiceStub.RemoveCACGroupAddrResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeCACGroupAddr operation
   */
  public void receiveErrorremoveCACGroupAddr(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for bulkAssignTreatments method override this method for
   * handling normal response from bulkAssignTreatments operation
   */
  public void receiveResultbulkAssignTreatments(
      openscape_voice.Openscape_voiceStub.BulkAssignTreatmentsResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * bulkAssignTreatments operation
   */
  public void receiveErrorbulkAssignTreatments(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getMediaServerAssignmentList method override this
   * method for handling normal response from getMediaServerAssignmentList operation
   */
  public void receiveResultgetMediaServerAssignmentList(
      openscape_voice.Openscape_voiceStub.GetMediaServerListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getMediaServerAssignmentList operation
   */
  public void receiveErrorgetMediaServerAssignmentList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for blockMediaGateway method override this method for
   * handling normal response from blockMediaGateway operation
   */
  public void receiveResultblockMediaGateway(
      openscape_voice.Openscape_voiceStub.BlockMediaGatewayResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * blockMediaGateway operation
   */
  public void receiveErrorblockMediaGateway(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getCOSList2 method override this method for handling
   * normal response from getCOSList2 operation
   */
  public void receiveResultgetCOSList2(
      openscape_voice.Openscape_voiceStub.GetCOSListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getCOSList2 operation
   */
  public void receiveErrorgetCOSList2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deletePrefixAccessCode2 method override this method
   * for handling normal response from deletePrefixAccessCode2 operation
   */
  public void receiveResultdeletePrefixAccessCode2(
      openscape_voice.Openscape_voiceStub.PrefixAccessCodeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deletePrefixAccessCode2 operation
   */
  public void receiveErrordeletePrefixAccessCode2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryIntercept method override this method for
   * handling normal response from queryIntercept operation
   */
  public void receiveResultqueryIntercept(
      openscape_voice.Openscape_voiceStub.InterceptResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryIntercept operation
   */
  public void receiveErrorqueryIntercept(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createSipReason method override this method for
   * handling normal response from createSipReason operation
   */
  public void receiveResultcreateSipReason(
      openscape_voice.Openscape_voiceStub.CreateSipReasonResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createSipReason operation
   */
  public void receiveErrorcreateSipReason(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getLogFiles method override this method for handling
   * normal response from getLogFiles operation
   */
  public void receiveResultgetLogFiles(
      openscape_voice.Openscape_voiceStub.GetLogFilesResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getLogFiles operation
   */
  public void receiveErrorgetLogFiles(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getEpInfoByRelease method override this method for
   * handling normal response from getEpInfoByRelease operation
   */
  public void receiveResultgetEpInfoByRelease(
      openscape_voice.Openscape_voiceStub.GetEpInfoResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getEpInfoByRelease operation
   */
  public void receiveErrorgetEpInfoByRelease(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryCORUsageList method override this method for
   * handling normal response from queryCORUsageList operation
   */
  public void receiveResultqueryCORUsageList(
      openscape_voice.Openscape_voiceStub.QueryCORUsageListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryCORUsageList operation
   */
  public void receiveErrorqueryCORUsageList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteTrafficType method override this method for
   * handling normal response from deleteTrafficType operation
   */
  public void receiveResultdeleteTrafficType(
      openscape_voice.Openscape_voiceStub.DeleteTrafficTypeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteTrafficType operation
   */
  public void receiveErrordeleteTrafficType(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getEAGroupMemberList method override this method for
   * handling normal response from getEAGroupMemberList operation
   */
  public void receiveResultgetEAGroupMemberList(
      openscape_voice.Openscape_voiceStub.GetEAGroupMemberListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getEAGroupMemberList operation
   */
  public void receiveErrorgetEAGroupMemberList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for testAuditEndpoint method override this method for
   * handling normal response from testAuditEndpoint operation
   */
  public void receiveResulttestAuditEndpoint(
      openscape_voice.Openscape_voiceStub.TestAuditEndpointResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * testAuditEndpoint operation
   */
  public void receiveErrortestAuditEndpoint(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyPrefixAccessCode2 method override this method
   * for handling normal response from modifyPrefixAccessCode2 operation
   */
  public void receiveResultmodifyPrefixAccessCode2(
      openscape_voice.Openscape_voiceStub.PrefixAccessCodeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyPrefixAccessCode2 operation
   */
  public void receiveErrormodifyPrefixAccessCode2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteDnmDefinition method override this method for
   * handling normal response from deleteDnmDefinition operation
   */
  public void receiveResultdeleteDnmDefinition(
      openscape_voice.Openscape_voiceStub.DeleteDnmDefinitionResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteDnmDefinition operation
   */
  public void receiveErrordeleteDnmDefinition(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeMediaGatewayCircuits method override this
   * method for handling normal response from removeMediaGatewayCircuits operation
   */
  public void receiveResultremoveMediaGatewayCircuits(
      openscape_voice.Openscape_voiceStub.RemoveMediaGatewayCircuitsResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeMediaGatewayCircuits operation
   */
  public void receiveErrorremoveMediaGatewayCircuits(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for upgradeCommit method override this method for
   * handling normal response from upgradeCommit operation
   */
  public void receiveResultupgradeCommit(
      openscape_voice.Openscape_voiceStub.UpgradeCommitResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * upgradeCommit operation
   */
  public void receiveErrorupgradeCommit(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyLogClient method override this method for
   * handling normal response from modifyLogClient operation
   */
  public void receiveResultmodifyLogClient(
      openscape_voice.Openscape_voiceStub.ModifyLogClientResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyLogClient operation
   */
  public void receiveErrormodifyLogClient(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyHomeDn method override this method for handling
   * normal response from modifyHomeDn operation
   */
  public void receiveResultmodifyHomeDn(
      openscape_voice.Openscape_voiceStub.ModifyHomeDnResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyHomeDn operation
   */
  public void receiveErrormodifyHomeDn(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getPFRSymbolicNameList method override this method
   * for handling normal response from getPFRSymbolicNameList operation
   */
  public void receiveResultgetPFRSymbolicNameList(
      openscape_voice.Openscape_voiceStub.GetPFRSymbolicNameListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getPFRSymbolicNameList operation
   */
  public void receiveErrorgetPFRSymbolicNameList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createDomainCode method override this method for
   * handling normal response from createDomainCode operation
   */
  public void receiveResultcreateDomainCode(
      openscape_voice.Openscape_voiceStub.CreateDomainCodeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createDomainCode operation
   */
  public void receiveErrorcreateDomainCode(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateEpMgtInfo2 method override this method for
   * handling normal response from updateEpMgtInfo2 operation
   */
  public void receiveResultupdateEpMgtInfo2(
      openscape_voice.Openscape_voiceStub.UpdateEpMgtInfoResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateEpMgtInfo2 operation
   */
  public void receiveErrorupdateEpMgtInfo2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyDestination method override this method for
   * handling normal response from modifyDestination operation
   */
  public void receiveResultmodifyDestination(
      openscape_voice.Openscape_voiceStub.ModifyDestinationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyDestination operation
   */
  public void receiveErrormodifyDestination(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryDnmNormalization method override this method for
   * handling normal response from queryDnmNormalization operation
   */
  public void receiveResultqueryDnmNormalization(
      openscape_voice.Openscape_voiceStub.QueryDnmNormalizationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryDnmNormalization operation
   */
  public void receiveErrorqueryDnmNormalization(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyCpuGroup method override this method for
   * handling normal response from modifyCpuGroup operation
   */
  public void receiveResultmodifyCpuGroup(
      openscape_voice.Openscape_voiceStub.ModifyCpuGroupResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyCpuGroup operation
   */
  public void receiveErrormodifyCpuGroup(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for assignMediaServerToBranchOffice method override this
   * method for handling normal response from assignMediaServerToBranchOffice operation
   */
  public void receiveResultassignMediaServerToBranchOffice(
      openscape_voice.Openscape_voiceStub.AssignMediaServerResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * assignMediaServerToBranchOffice operation
   */
  public void receiveErrorassignMediaServerToBranchOffice(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateSubscriberFeatures2 method override this method
   * for handling normal response from updateSubscriberFeatures2 operation
   */
  public void receiveResultupdateSubscriberFeatures2(
      openscape_voice.Openscape_voiceStub.UpdateSubscriberFeaturesResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateSubscriberFeatures2 operation
   */
  public void receiveErrorupdateSubscriberFeatures2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createRoute method override this method for handling
   * normal response from createRoute operation
   */
  public void receiveResultcreateRoute(
      openscape_voice.Openscape_voiceStub.CreateRouteResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createRoute operation
   */
  public void receiveErrorcreateRoute(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyServiceGroup method override this method for
   * handling normal response from modifyServiceGroup operation
   */
  public void receiveResultmodifyServiceGroup(
      openscape_voice.Openscape_voiceStub.ModifyServiceGroupResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyServiceGroup operation
   */
  public void receiveErrormodifyServiceGroup(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyDnmLocalToll method override this method for
   * handling normal response from modifyDnmLocalToll operation
   */
  public void receiveResultmodifyDnmLocalToll(
      openscape_voice.Openscape_voiceStub.ModifyDnmLocalTollResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyDnmLocalToll operation
   */
  public void receiveErrormodifyDnmLocalToll(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getAccessTokenList method override this method for
   * handling normal response from getAccessTokenList operation
   */
  public void receiveResultgetAccessTokenList(
      openscape_voice.Openscape_voiceStub.GetAccessTokenListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getAccessTokenList operation
   */
  public void receiveErrorgetAccessTokenList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryCACMonitoring method override this method for
   * handling normal response from queryCACMonitoring operation
   */
  public void receiveResultqueryCACMonitoring(
      openscape_voice.Openscape_voiceStub.QueryCACMonitoringResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryCACMonitoring operation
   */
  public void receiveErrorqueryCACMonitoring(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getSystemInfo method override this method for
   * handling normal response from getSystemInfo operation
   */
  public void receiveResultgetSystemInfo(
      openscape_voice.Openscape_voiceStub.GetSystemInfoResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getSystemInfo operation
   */
  public void receiveErrorgetSystemInfo(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateSubscriberFeatureProfile2 method override this
   * method for handling normal response from updateSubscriberFeatureProfile2 operation
   */
  public void receiveResultupdateSubscriberFeatureProfile2(
      openscape_voice.Openscape_voiceStub.UpdateSubscriberFeatureProfileResultE result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateSubscriberFeatureProfile2 operation
   */
  public void receiveErrorupdateSubscriberFeatureProfile2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for assignDaySchedule method override this method for
   * handling normal response from assignDaySchedule operation
   */
  public void receiveResultassignDaySchedule(
      openscape_voice.Openscape_voiceStub.AssignDayScheduleResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * assignDaySchedule operation
   */
  public void receiveErrorassignDaySchedule(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getContactList method override this method for
   * handling normal response from getContactList operation
   */
  public void receiveResultgetContactList(
      openscape_voice.Openscape_voiceStub.GetContactListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getContactList operation
   */
  public void receiveErrorgetContactList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getVersion2 method override this method for handling
   * normal response from getVersion2 operation
   */
  public void receiveResultgetVersion2(
      openscape_voice.Openscape_voiceStub.GetVersionResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getVersion2 operation
   */
  public void receiveErrorgetVersion2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryEndpointLocation method override this method for
   * handling normal response from queryEndpointLocation operation
   */
  public void receiveResultqueryEndpointLocation(
      openscape_voice.Openscape_voiceStub.EndpointLocationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryEndpointLocation operation
   */
  public void receiveErrorqueryEndpointLocation(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createMobileClientProfile method override this method
   * for handling normal response from createMobileClientProfile operation
   */
  public void receiveResultcreateMobileClientProfile(
      openscape_voice.Openscape_voiceStub.CreateMobileClientProfileResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createMobileClientProfile operation
   */
  public void receiveErrorcreateMobileClientProfile(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryLostServer method override this method for
   * handling normal response from queryLostServer operation
   */
  public void receiveResultqueryLostServer(
      openscape_voice.Openscape_voiceStub.QueryLostServerResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryLostServer operation
   */
  public void receiveErrorqueryLostServer(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for contactMe method override this method for handling
   * normal response from contactMe operation
   */
  public void receiveResultcontactMe(openscape_voice.Openscape_voiceStub.ContactMeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * contactMe operation
   */
  public void receiveErrorcontactMe(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createEnumServer method override this method for
   * handling normal response from createEnumServer operation
   */
  public void receiveResultcreateEnumServer(
      openscape_voice.Openscape_voiceStub.CreateEnumServerResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createEnumServer operation
   */
  public void receiveErrorcreateEnumServer(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for accessEZIPParm method override this method for
   * handling normal response from accessEZIPParm operation
   */
  public void receiveResultaccessEZIPParm(
      openscape_voice.Openscape_voiceStub.AccessEZIPParmResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * accessEZIPParm operation
   */
  public void receiveErroraccessEZIPParm(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeIntercept method override this method for
   * handling normal response from removeIntercept operation
   */
  public void receiveResultremoveIntercept(
      openscape_voice.Openscape_voiceStub.RemoveInterceptResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeIntercept operation
   */
  public void receiveErrorremoveIntercept(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deletePnpLocationCode2 method override this method
   * for handling normal response from deletePnpLocationCode2 operation
   */
  public void receiveResultdeletePnpLocationCode2(
      openscape_voice.Openscape_voiceStub.PnpLocationCodeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deletePnpLocationCode2 operation
   */
  public void receiveErrordeletePnpLocationCode2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateEAMemberData method override this method for
   * handling normal response from updateEAMemberData operation
   */
  public void receiveResultupdateEAMemberData(
      openscape_voice.Openscape_voiceStub.UpdateEAMemberDataResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateEAMemberData operation
   */
  public void receiveErrorupdateEAMemberData(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createDaySchedule method override this method for
   * handling normal response from createDaySchedule operation
   */
  public void receiveResultcreateDaySchedule(
      openscape_voice.Openscape_voiceStub.CreateDayScheduleResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createDaySchedule operation
   */
  public void receiveErrorcreateDaySchedule(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for setGlobalCACPolicyThresholdAlarms method override
   * this method for handling normal response from setGlobalCACPolicyThresholdAlarms operation
   */
  public void receiveResultsetGlobalCACPolicyThresholdAlarms(
      openscape_voice.Openscape_voiceStub.SetGlobalCACPolicyThresholdAlarmsResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * setGlobalCACPolicyThresholdAlarms operation
   */
  public void receiveErrorsetGlobalCACPolicyThresholdAlarms(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyServerFE method override this method for
   * handling normal response from modifyServerFE operation
   */
  public void receiveResultmodifyServerFE(
      openscape_voice.Openscape_voiceStub.ModifyServerFEResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyServerFE operation
   */
  public void receiveErrormodifyServerFE(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeDaySchedule method override this method for
   * handling normal response from removeDaySchedule operation
   */
  public void receiveResultremoveDaySchedule(
      openscape_voice.Openscape_voiceStub.RemoveDayScheduleResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeDaySchedule operation
   */
  public void receiveErrorremoveDaySchedule(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getEpList2 method override this method for handling
   * normal response from getEpList2 operation
   */
  public void receiveResultgetEpList2(openscape_voice.Openscape_voiceStub.GetEpListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getEpList2 operation
   */
  public void receiveErrorgetEpList2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateMobileClientProfile method override this method
   * for handling normal response from updateMobileClientProfile operation
   */
  public void receiveResultupdateMobileClientProfile(
      openscape_voice.Openscape_voiceStub.UpdateMobileClientProfileResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateMobileClientProfile operation
   */
  public void receiveErrorupdateMobileClientProfile(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyDaySchedule method override this method for
   * handling normal response from modifyDaySchedule operation
   */
  public void receiveResultmodifyDaySchedule(
      openscape_voice.Openscape_voiceStub.ModifyDayScheduleResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyDaySchedule operation
   */
  public void receiveErrormodifyDaySchedule(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyDomainCode method override this method for
   * handling normal response from modifyDomainCode operation
   */
  public void receiveResultmodifyDomainCode(
      openscape_voice.Openscape_voiceStub.ModifyDomainCodeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyDomainCode operation
   */
  public void receiveErrormodifyDomainCode(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createOriginRoute method override this method for
   * handling normal response from createOriginRoute operation
   */
  public void receiveResultcreateOriginRoute(
      openscape_voice.Openscape_voiceStub.CreateOriginRouteResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createOriginRoute operation
   */
  public void receiveErrorcreateOriginRoute(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for addLocalCpuMembers method override this method for
   * handling normal response from addLocalCpuMembers operation
   */
  public void receiveResultaddLocalCpuMembers(
      openscape_voice.Openscape_voiceStub.AddLocalCpuMembersResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * addLocalCpuMembers operation
   */
  public void receiveErroraddLocalCpuMembers(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteDnmLocalToll method override this method for
   * handling normal response from deleteDnmLocalToll operation
   */
  public void receiveResultdeleteDnmLocalToll(
      openscape_voice.Openscape_voiceStub.DeleteDnmLocalTollResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteDnmLocalToll operation
   */
  public void receiveErrordeleteDnmLocalToll(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createLogClient method override this method for
   * handling normal response from createLogClient operation
   */
  public void receiveResultcreateLogClient(
      openscape_voice.Openscape_voiceStub.CreateLogClientResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createLogClient operation
   */
  public void receiveErrorcreateLogClient(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getMobileClientProfile method override this method
   * for handling normal response from getMobileClientProfile operation
   */
  public void receiveResultgetMobileClientProfile(
      openscape_voice.Openscape_voiceStub.GetMobileClientProfileResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getMobileClientProfile operation
   */
  public void receiveErrorgetMobileClientProfile(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeMobileClientProfile method override this method
   * for handling normal response from removeMobileClientProfile operation
   */
  public void receiveResultremoveMobileClientProfile(
      openscape_voice.Openscape_voiceStub.RemoveMobileClientProfileResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeMobileClientProfile operation
   */
  public void receiveErrorremoveMobileClientProfile(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getLocationService method override this method for
   * handling normal response from getLocationService operation
   */
  public void receiveResultgetLocationService(
      openscape_voice.Openscape_voiceStub.GetLocationServiceResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getLocationService operation
   */
  public void receiveErrorgetLocationService(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for setLoggedEvents method override this method for
   * handling normal response from setLoggedEvents operation
   */
  public void receiveResultsetLoggedEvents(
      openscape_voice.Openscape_voiceStub.SetLoggedEventsResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * setLoggedEvents operation
   */
  public void receiveErrorsetLoggedEvents(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getBGDnList method override this method for handling
   * normal response from getBGDnList operation
   */
  public void receiveResultgetBGDnList(openscape_voice.Openscape_voiceStub.GetBGDnResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getBGDnList operation
   */
  public void receiveErrorgetBGDnList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getSubscriberInfo2 method override this method for
   * handling normal response from getSubscriberInfo2 operation
   */
  public void receiveResultgetSubscriberInfo2(
      openscape_voice.Openscape_voiceStub.GetSubscriberResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getSubscriberInfo2 operation
   */
  public void receiveErrorgetSubscriberInfo2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyTimeDestination method override this method for
   * handling normal response from modifyTimeDestination operation
   */
  public void receiveResultmodifyTimeDestination(
      openscape_voice.Openscape_voiceStub.ModifyTimeDestinationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyTimeDestination operation
   */
  public void receiveErrormodifyTimeDestination(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryDnmDefinition method override this method for
   * handling normal response from queryDnmDefinition operation
   */
  public void receiveResultqueryDnmDefinition(
      openscape_voice.Openscape_voiceStub.QueryDnmDefinitionResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryDnmDefinition operation
   */
  public void receiveErrorqueryDnmDefinition(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for bulkUnassignTreatments method override this method
   * for handling normal response from bulkUnassignTreatments operation
   */
  public void receiveResultbulkUnassignTreatments(
      openscape_voice.Openscape_voiceStub.BulkUnassignTreatmentsResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * bulkUnassignTreatments operation
   */
  public void receiveErrorbulkUnassignTreatments(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createDnmDefinition method override this method for
   * handling normal response from createDnmDefinition operation
   */
  public void receiveResultcreateDnmDefinition(
      openscape_voice.Openscape_voiceStub.CreateDnmDefinitionResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createDnmDefinition operation
   */
  public void receiveErrorcreateDnmDefinition(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getLocalCpuMemberList method override this method for
   * handling normal response from getLocalCpuMemberList operation
   */
  public void receiveResultgetLocalCpuMemberList(
      openscape_voice.Openscape_voiceStub.GetLocalCpuMemberListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getLocalCpuMemberList operation
   */
  public void receiveErrorgetLocalCpuMemberList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createEAGroupRelationship method override this method
   * for handling normal response from createEAGroupRelationship operation
   */
  public void receiveResultcreateEAGroupRelationship(
      openscape_voice.Openscape_voiceStub.CreateEAGroupRelationshipResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createEAGroupRelationship operation
   */
  public void receiveErrorcreateEAGroupRelationship(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteEpProfile2 method override this method for
   * handling normal response from deleteEpProfile2 operation
   */
  public void receiveResultdeleteEpProfile2(
      openscape_voice.Openscape_voiceStub.DeleteEpProfileResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteEpProfile2 operation
   */
  public void receiveErrordeleteEpProfile2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryCommunityGroup method override this method for
   * handling normal response from queryCommunityGroup operation
   */
  public void receiveResultqueryCommunityGroup(
      openscape_voice.Openscape_voiceStub.QueryCommunityGroupResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryCommunityGroup operation
   */
  public void receiveErrorqueryCommunityGroup(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for startFileExport method override this method for
   * handling normal response from startFileExport operation
   */
  public void receiveResultstartFileExport(
      openscape_voice.Openscape_voiceStub.StartFileExportRes result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * startFileExport operation
   */
  public void receiveErrorstartFileExport(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getCOSList method override this method for handling
   * normal response from getCOSList operation
   */
  public void receiveResultgetCOSList(
      openscape_voice.Openscape_voiceStub.GetCOSListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getCOSList operation
   */
  public void receiveErrorgetCOSList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createDnmLocalTollExchangeCodes method override this
   * method for handling normal response from createDnmLocalTollExchangeCodes operation
   */
  public void receiveResultcreateDnmLocalTollExchangeCodes(
      openscape_voice.Openscape_voiceStub.CreateDnmLocalTollExchangeCodesResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createDnmLocalTollExchangeCodes operation
   */
  public void receiveErrorcreateDnmLocalTollExchangeCodes(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for bulkModifyTreatments method override this method for
   * handling normal response from bulkModifyTreatments operation
   */
  public void receiveResultbulkModifyTreatments(
      openscape_voice.Openscape_voiceStub.BulkModifyTreatmentsResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * bulkModifyTreatments operation
   */
  public void receiveErrorbulkModifyTreatments(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyMlhgTermInfo2 method override this method for
   * handling normal response from modifyMlhgTermInfo2 operation
   */
  public void receiveResultmodifyMlhgTermInfo2(
      openscape_voice.Openscape_voiceStub.MlhgTermResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyMlhgTermInfo2 operation
   */
  public void receiveErrormodifyMlhgTermInfo2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateBGStatus2 method override this method for
   * handling normal response from updateBGStatus2 operation
   */
  public void receiveResultupdateBGStatus2(
      openscape_voice.Openscape_voiceStub.UpdateBGStatusResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateBGStatus2 operation
   */
  public void receiveErrorupdateBGStatus2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getEAGroupList method override this method for
   * handling normal response from getEAGroupList operation
   */
  public void receiveResultgetEAGroupList(
      openscape_voice.Openscape_voiceStub.GetEAGroupListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getEAGroupList operation
   */
  public void receiveErrorgetEAGroupList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for checkHeldServerStatus method override this method for
   * handling normal response from checkHeldServerStatus operation
   */
  public void receiveResultcheckHeldServerStatus(
      openscape_voice.Openscape_voiceStub.CheckHeldServerStatusResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * checkHeldServerStatus operation
   */
  public void receiveErrorcheckHeldServerStatus(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyRoute method override this method for handling
   * normal response from modifyRoute operation
   */
  public void receiveResultmodifyRoute(
      openscape_voice.Openscape_voiceStub.ModifyRouteResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyRoute operation
   */
  public void receiveErrormodifyRoute(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createDnmLocalToll method override this method for
   * handling normal response from createDnmLocalToll operation
   */
  public void receiveResultcreateDnmLocalToll(
      openscape_voice.Openscape_voiceStub.CreateDnmLocalTollResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createDnmLocalToll operation
   */
  public void receiveErrorcreateDnmLocalToll(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeDestination method override this method for
   * handling normal response from removeDestination operation
   */
  public void receiveResultremoveDestination(
      openscape_voice.Openscape_voiceStub.RemoveDestinationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeDestination operation
   */
  public void receiveErrorremoveDestination(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyGToGCACPolicy method override this method for
   * handling normal response from modifyGToGCACPolicy operation
   */
  public void receiveResultmodifyGToGCACPolicy(
      openscape_voice.Openscape_voiceStub.ModifyGToGCACPolicyResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyGToGCACPolicy operation
   */
  public void receiveErrormodifyGToGCACPolicy(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateBgSubnet2 method override this method for
   * handling normal response from updateBgSubnet2 operation
   */
  public void receiveResultupdateBgSubnet2(
      openscape_voice.Openscape_voiceStub.UpdateBgSubnetResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateBgSubnet2 operation
   */
  public void receiveErrorupdateBgSubnet2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyLostServer method override this method for
   * handling normal response from modifyLostServer operation
   */
  public void receiveResultmodifyLostServer(
      openscape_voice.Openscape_voiceStub.ModifyLostServerResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyLostServer operation
   */
  public void receiveErrormodifyLostServer(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getDatabaseJobList method override this method for
   * handling normal response from getDatabaseJobList operation
   */
  public void receiveResultgetDatabaseJobList(
      openscape_voice.Openscape_voiceStub.GetDatabaseJobListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getDatabaseJobList operation
   */
  public void receiveErrorgetDatabaseJobList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteCSTAApplication method override this method for
   * handling normal response from deleteCSTAApplication operation
   */
  public void receiveResultdeleteCSTAApplication(
      openscape_voice.Openscape_voiceStub.DeleteCSTAApplicationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteCSTAApplication operation
   */
  public void receiveErrordeleteCSTAApplication(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getCallingLocationList method override this method
   * for handling normal response from getCallingLocationList operation
   */
  public void receiveResultgetCallingLocationList(
      openscape_voice.Openscape_voiceStub.GetCallingLocationListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getCallingLocationList operation
   */
  public void receiveErrorgetCallingLocationList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryBranchOffice method override this method for
   * handling normal response from queryBranchOffice operation
   */
  public void receiveResultqueryBranchOffice(
      openscape_voice.Openscape_voiceStub.QueryBranchOfficeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryBranchOffice operation
   */
  public void receiveErrorqueryBranchOffice(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyPnpLocationCode2 method override this method
   * for handling normal response from modifyPnpLocationCode2 operation
   */
  public void receiveResultmodifyPnpLocationCode2(
      openscape_voice.Openscape_voiceStub.PnpLocationCodeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyPnpLocationCode2 operation
   */
  public void receiveErrormodifyPnpLocationCode2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for addRemoteCpuGroups method override this method for
   * handling normal response from addRemoteCpuGroups operation
   */
  public void receiveResultaddRemoteCpuGroups(
      openscape_voice.Openscape_voiceStub.AddRemoteCpuGroupsResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * addRemoteCpuGroups operation
   */
  public void receiveErroraddRemoteCpuGroups(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteSystemSipEntry method override this method for
   * handling normal response from deleteSystemSipEntry operation
   */
  public void receiveResultdeleteSystemSipEntry(
      openscape_voice.Openscape_voiceStub.SystemSipEntryResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteSystemSipEntry operation
   */
  public void receiveErrordeleteSystemSipEntry(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getDestCodeList2 method override this method for
   * handling normal response from getDestCodeList2 operation
   */
  public void receiveResultgetDestCodeList2(
      openscape_voice.Openscape_voiceStub.GetDestCodeListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getDestCodeList2 operation
   */
  public void receiveErrorgetDestCodeList2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getSubscriberInfoByOption2 method override this
   * method for handling normal response from getSubscriberInfoByOption2 operation
   */
  public void receiveResultgetSubscriberInfoByOption2(
      openscape_voice.Openscape_voiceStub.GetSubscriberResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getSubscriberInfoByOption2 operation
   */
  public void receiveErrorgetSubscriberInfoByOption2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for genericJob method override this method for handling
   * normal response from genericJob operation
   */
  public void receiveResultgenericJob(
      openscape_voice.Openscape_voiceStub.GenericJobResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * genericJob operation
   */
  public void receiveErrorgenericJob(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeBcastGroup method override this method for
   * handling normal response from removeBcastGroup operation
   */
  public void receiveResultremoveBcastGroup(
      openscape_voice.Openscape_voiceStub.RemoveBcastGroupResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeBcastGroup operation
   */
  public void receiveErrorremoveBcastGroup(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeOfficeCode method override this method for
   * handling normal response from removeOfficeCode operation
   */
  public void receiveResultremoveOfficeCode(
      openscape_voice.Openscape_voiceStub.RemoveOfficeCodeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeOfficeCode operation
   */
  public void receiveErrorremoveOfficeCode(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getElementState method override this method for
   * handling normal response from getElementState operation
   */
  public void receiveResultgetElementState(
      openscape_voice.Openscape_voiceStub.GetElementStateResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getElementState operation
   */
  public void receiveErrorgetElementState(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for addCertificate method override this method for
   * handling normal response from addCertificate operation
   */
  public void receiveResultaddCertificate(
      openscape_voice.Openscape_voiceStub.AddCertificateResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * addCertificate operation
   */
  public void receiveErroraddCertificate(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyBranchOffice method override this method for
   * handling normal response from modifyBranchOffice operation
   */
  public void receiveResultmodifyBranchOffice(
      openscape_voice.Openscape_voiceStub.ModifyBranchOfficeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyBranchOffice operation
   */
  public void receiveErrormodifyBranchOffice(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getSubscriberRG method override this method for
   * handling normal response from getSubscriberRG operation
   */
  public void receiveResultgetSubscriberRG(
      openscape_voice.Openscape_voiceStub.GetSubscriberRGResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getSubscriberRG operation
   */
  public void receiveErrorgetSubscriberRG(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getDestServiceList2 method override this method for
   * handling normal response from getDestServiceList2 operation
   */
  public void receiveResultgetDestServiceList2(
      openscape_voice.Openscape_voiceStub.GetDestServiceListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getDestServiceList2 operation
   */
  public void receiveErrorgetDestServiceList2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getRemoteCpuGroupList method override this method for
   * handling normal response from getRemoteCpuGroupList operation
   */
  public void receiveResultgetRemoteCpuGroupList(
      openscape_voice.Openscape_voiceStub.GetRemoteCpuGroupListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getRemoteCpuGroupList operation
   */
  public void receiveErrorgetRemoteCpuGroupList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createEsrpQueue method override this method for
   * handling normal response from createEsrpQueue operation
   */
  public void receiveResultcreateEsrpQueue(
      openscape_voice.Openscape_voiceStub.CreateEsrpQueueResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createEsrpQueue operation
   */
  public void receiveErrorcreateEsrpQueue(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryServerFEs method override this method for
   * handling normal response from queryServerFEs operation
   */
  public void receiveResultqueryServerFEs(
      openscape_voice.Openscape_voiceStub.QueryServerFEsResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryServerFEs operation
   */
  public void receiveErrorqueryServerFEs(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryDomainCode method override this method for
   * handling normal response from queryDomainCode operation
   */
  public void receiveResultqueryDomainCode(
      openscape_voice.Openscape_voiceStub.QueryDomainCodeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryDomainCode operation
   */
  public void receiveErrorqueryDomainCode(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryDaySchedule method override this method for
   * handling normal response from queryDaySchedule operation
   */
  public void receiveResultqueryDaySchedule(
      openscape_voice.Openscape_voiceStub.DayScheduleResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryDaySchedule operation
   */
  public void receiveErrorqueryDaySchedule(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyClassService method override this method for
   * handling normal response from modifyClassService operation
   */
  public void receiveResultmodifyClassService(
      openscape_voice.Openscape_voiceStub.ModifyClassServiceResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyClassService operation
   */
  public void receiveErrormodifyClassService(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getCertificateList method override this method for
   * handling normal response from getCertificateList operation
   */
  public void receiveResultgetCertificateList(
      openscape_voice.Openscape_voiceStub.GetCertificateListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getCertificateList operation
   */
  public void receiveErrorgetCertificateList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for unassignMediaServerFromBranchOffice method override
   * this method for handling normal response from unassignMediaServerFromBranchOffice operation
   */
  public void receiveResultunassignMediaServerFromBranchOffice(
      openscape_voice.Openscape_voiceStub.UnassignMediaServerResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * unassignMediaServerFromBranchOffice operation
   */
  public void receiveErrorunassignMediaServerFromBranchOffice(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getBGInfoByOptions2 method override this method for
   * handling normal response from getBGInfoByOptions2 operation
   */
  public void receiveResultgetBGInfoByOptions2(
      openscape_voice.Openscape_voiceStub.GetBGResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getBGInfoByOptions2 operation
   */
  public void receiveErrorgetBGInfoByOptions2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteBgSpeedDialListEntries method override this
   * method for handling normal response from deleteBgSpeedDialListEntries operation
   */
  public void receiveResultdeleteBgSpeedDialListEntries(
      openscape_voice.Openscape_voiceStub.DeleteBgSpeedDialListEntriesResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteBgSpeedDialListEntries operation
   */
  public void receiveErrordeleteBgSpeedDialListEntries(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteDnmModification method override this method for
   * handling normal response from deleteDnmModification operation
   */
  public void receiveResultdeleteDnmModification(
      openscape_voice.Openscape_voiceStub.DeleteDnmModificationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteDnmModification operation
   */
  public void receiveErrordeleteDnmModification(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteDestCode2 method override this method for
   * handling normal response from deleteDestCode2 operation
   */
  public void receiveResultdeleteDestCode2(
      openscape_voice.Openscape_voiceStub.DestCodeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteDestCode2 operation
   */
  public void receiveErrordeleteDestCode2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyMediaGateway method override this method for
   * handling normal response from modifyMediaGateway operation
   */
  public void receiveResultmodifyMediaGateway(
      openscape_voice.Openscape_voiceStub.ModifyMediaGatewayResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyMediaGateway operation
   */
  public void receiveErrormodifyMediaGateway(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteEAGroupRelationship method override this method
   * for handling normal response from deleteEAGroupRelationship operation
   */
  public void receiveResultdeleteEAGroupRelationship(
      openscape_voice.Openscape_voiceStub.DeleteEAGroupRelationshipResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteEAGroupRelationship operation
   */
  public void receiveErrordeleteEAGroupRelationship(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryAlias method override this method for handling
   * normal response from queryAlias operation
   */
  public void receiveResultqueryAlias(openscape_voice.Openscape_voiceStub.AliasResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryAlias operation
   */
  public void receiveErrorqueryAlias(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createClassService method override this method for
   * handling normal response from createClassService operation
   */
  public void receiveResultcreateClassService(
      openscape_voice.Openscape_voiceStub.CreateClassServiceResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createClassService operation
   */
  public void receiveErrorcreateClassService(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteNumberPlan2 method override this method for
   * handling normal response from deleteNumberPlan2 operation
   */
  public void receiveResultdeleteNumberPlan2(
      openscape_voice.Openscape_voiceStub.NumberPlanResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteNumberPlan2 operation
   */
  public void receiveErrordeleteNumberPlan2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createEpProfile2 method override this method for
   * handling normal response from createEpProfile2 operation
   */
  public void receiveResultcreateEpProfile2(
      openscape_voice.Openscape_voiceStub.CreateEpProfileResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createEpProfile2 operation
   */
  public void receiveErrorcreateEpProfile2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryParkingLotList method override this method for
   * handling normal response from queryParkingLotList operation
   */
  public void receiveResultqueryParkingLotList(
      openscape_voice.Openscape_voiceStub.QueryParkingLotListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryParkingLotList operation
   */
  public void receiveErrorqueryParkingLotList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getBGInfo2 method override this method for handling
   * normal response from getBGInfo2 operation
   */
  public void receiveResultgetBGInfo2(openscape_voice.Openscape_voiceStub.GetBGResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getBGInfo2 operation
   */
  public void receiveErrorgetBGInfo2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyAuthCode method override this method for
   * handling normal response from modifyAuthCode operation
   */
  public void receiveResultmodifyAuthCode(
      openscape_voice.Openscape_voiceStub.ModifyAuthCodeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyAuthCode operation
   */
  public void receiveErrormodifyAuthCode(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryPeriodSchedule method override this method for
   * handling normal response from queryPeriodSchedule operation
   */
  public void receiveResultqueryPeriodSchedule(
      openscape_voice.Openscape_voiceStub.PeriodScheduleResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryPeriodSchedule operation
   */
  public void receiveErrorqueryPeriodSchedule(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteServerFE method override this method for
   * handling normal response from deleteServerFE operation
   */
  public void receiveResultdeleteServerFE(
      openscape_voice.Openscape_voiceStub.DeleteServerFEResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteServerFE operation
   */
  public void receiveErrordeleteServerFE(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteCertificate method override this method for
   * handling normal response from deleteCertificate operation
   */
  public void receiveResultdeleteCertificate(
      openscape_voice.Openscape_voiceStub.DeleteCertificateResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteCertificate operation
   */
  public void receiveErrordeleteCertificate(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyEndpointProvider method override this method
   * for handling normal response from modifyEndpointProvider operation
   */
  public void receiveResultmodifyEndpointProvider(
      openscape_voice.Openscape_voiceStub.ModifyEndpointProviderResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyEndpointProvider operation
   */
  public void receiveErrormodifyEndpointProvider(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getFeatureProfileList method override this method for
   * handling normal response from getFeatureProfileList operation
   */
  public void receiveResultgetFeatureProfileList(
      openscape_voice.Openscape_voiceStub.FeatureProfileListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getFeatureProfileList operation
   */
  public void receiveErrorgetFeatureProfileList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getKeysetPrimaryList method override this method for
   * handling normal response from getKeysetPrimaryList operation
   */
  public void receiveResultgetKeysetPrimaryList(
      openscape_voice.Openscape_voiceStub.GetKeysetPrimaryListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getKeysetPrimaryList operation
   */
  public void receiveErrorgetKeysetPrimaryList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createParkingLot method override this method for
   * handling normal response from createParkingLot operation
   */
  public void receiveResultcreateParkingLot(
      openscape_voice.Openscape_voiceStub.CreateParkingLotResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createParkingLot operation
   */
  public void receiveErrorcreateParkingLot(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryLotUsageList method override this method for
   * handling normal response from queryLotUsageList operation
   */
  public void receiveResultqueryLotUsageList(
      openscape_voice.Openscape_voiceStub.QueryLotUsageListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryLotUsageList operation
   */
  public void receiveErrorqueryLotUsageList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getDBRole method override this method for handling
   * normal response from getDBRole operation
   */
  public void receiveResultgetDBRole(openscape_voice.Openscape_voiceStub.GetDBRoleResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getDBRole operation
   */
  public void receiveErrorgetDBRole(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeHeldServer method override this method for
   * handling normal response from removeHeldServer operation
   */
  public void receiveResultremoveHeldServer(
      openscape_voice.Openscape_voiceStub.RemoveHeldServerResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeHeldServer operation
   */
  public void receiveErrorremoveHeldServer(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryRateArea method override this method for
   * handling normal response from queryRateArea operation
   */
  public void receiveResultqueryRateArea(
      openscape_voice.Openscape_voiceStub.RateAreaResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryRateArea operation
   */
  public void receiveErrorqueryRateArea(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryCSTAApplication method override this method for
   * handling normal response from queryCSTAApplication operation
   */
  public void receiveResultqueryCSTAApplication(
      openscape_voice.Openscape_voiceStub.QueryCSTAApplicationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryCSTAApplication operation
   */
  public void receiveErrorqueryCSTAApplication(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createServiceGroupMember method override this method
   * for handling normal response from createServiceGroupMember operation
   */
  public void receiveResultcreateServiceGroupMember(
      openscape_voice.Openscape_voiceStub.CreateServiceGroupMemberResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createServiceGroupMember operation
   */
  public void receiveErrorcreateServiceGroupMember(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeEndpointLocation method override this method
   * for handling normal response from removeEndpointLocation operation
   */
  public void receiveResultremoveEndpointLocation(
      openscape_voice.Openscape_voiceStub.RemoveEndpointLocationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeEndpointLocation operation
   */
  public void receiveErrorremoveEndpointLocation(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteCRL method override this method for handling
   * normal response from deleteCRL operation
   */
  public void receiveResultdeleteCRL(openscape_voice.Openscape_voiceStub.DeleteCRLResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteCRL operation
   */
  public void receiveErrordeleteCRL(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryDnmModification method override this method for
   * handling normal response from queryDnmModification operation
   */
  public void receiveResultqueryDnmModification(
      openscape_voice.Openscape_voiceStub.QueryDnmModificationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryDnmModification operation
   */
  public void receiveErrorqueryDnmModification(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateNumberPlan method override this method for
   * handling normal response from updateNumberPlan operation
   */
  public void receiveResultupdateNumberPlan(
      openscape_voice.Openscape_voiceStub.UpdateNumberPlanResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateNumberPlan operation
   */
  public void receiveErrorupdateNumberPlan(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createCallingLocation method override this method for
   * handling normal response from createCallingLocation operation
   */
  public void receiveResultcreateCallingLocation(
      openscape_voice.Openscape_voiceStub.CreateCallingLocationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createCallingLocation operation
   */
  public void receiveErrorcreateCallingLocation(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteBgSubnet2 method override this method for
   * handling normal response from deleteBgSubnet2 operation
   */
  public void receiveResultdeleteBgSubnet2(
      openscape_voice.Openscape_voiceStub.DeleteBgSubnetResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteBgSubnet2 operation
   */
  public void receiveErrordeleteBgSubnet2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryHeldServer method override this method for
   * handling normal response from queryHeldServer operation
   */
  public void receiveResultqueryHeldServer(
      openscape_voice.Openscape_voiceStub.QueryHeldServerResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryHeldServer operation
   */
  public void receiveErrorqueryHeldServer(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createCSTAApplication method override this method for
   * handling normal response from createCSTAApplication operation
   */
  public void receiveResultcreateCSTAApplication(
      openscape_voice.Openscape_voiceStub.CreateCSTAApplicationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createCSTAApplication operation
   */
  public void receiveErrorcreateCSTAApplication(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for revokeAccessToken method override this method for
   * handling normal response from revokeAccessToken operation
   */
  public void receiveResultrevokeAccessToken(
      openscape_voice.Openscape_voiceStub.RevokeAccessTokenResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * revokeAccessToken operation
   */
  public void receiveErrorrevokeAccessToken(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getFullyQualifiedNumber method override this method
   * for handling normal response from getFullyQualifiedNumber operation
   */
  public void receiveResultgetFullyQualifiedNumber(
      openscape_voice.Openscape_voiceStub.GetFullyQualifiedNumberResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getFullyQualifiedNumber operation
   */
  public void receiveErrorgetFullyQualifiedNumber(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryClassService method override this method for
   * handling normal response from queryClassService operation
   */
  public void receiveResultqueryClassService(
      openscape_voice.Openscape_voiceStub.ClassServiceResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryClassService operation
   */
  public void receiveErrorqueryClassService(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createBGDept2 method override this method for
   * handling normal response from createBGDept2 operation
   */
  public void receiveResultcreateBGDept2(
      openscape_voice.Openscape_voiceStub.CreateBGDeptResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createBGDept2 operation
   */
  public void receiveErrorcreateBGDept2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteMlhgTerm2 method override this method for
   * handling normal response from deleteMlhgTerm2 operation
   */
  public void receiveResultdeleteMlhgTerm2(
      openscape_voice.Openscape_voiceStub.MlhgTermResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteMlhgTerm2 operation
   */
  public void receiveErrordeleteMlhgTerm2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteBGCpu2 method override this method for handling
   * normal response from deleteBGCpu2 operation
   */
  public void receiveResultdeleteBGCpu2(openscape_voice.Openscape_voiceStub.BGCpuResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteBGCpu2 operation
   */
  public void receiveErrordeleteBGCpu2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for auditFeatureProfile method override this method for
   * handling normal response from auditFeatureProfile operation
   */
  public void receiveResultauditFeatureProfile(
      openscape_voice.Openscape_voiceStub.AuditFeatureProfileResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * auditFeatureProfile operation
   */
  public void receiveErrorauditFeatureProfile(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getSupportedLanguageList method override this method
   * for handling normal response from getSupportedLanguageList operation
   */
  public void receiveResultgetSupportedLanguageList(
      openscape_voice.Openscape_voiceStub.GetSupportedLanguageListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getSupportedLanguageList operation
   */
  public void receiveErrorgetSupportedLanguageList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryOperatorEnum method override this method for
   * handling normal response from queryOperatorEnum operation
   */
  public void receiveResultqueryOperatorEnum(
      openscape_voice.Openscape_voiceStub.OperatorEnumResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryOperatorEnum operation
   */
  public void receiveErrorqueryOperatorEnum(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeCommunityGroup method override this method for
   * handling normal response from removeCommunityGroup operation
   */
  public void receiveResultremoveCommunityGroup(
      openscape_voice.Openscape_voiceStub.RemoveCommunityGroupResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeCommunityGroup operation
   */
  public void receiveErrorremoveCommunityGroup(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getDestinationList2 method override this method for
   * handling normal response from getDestinationList2 operation
   */
  public void receiveResultgetDestinationList2(
      openscape_voice.Openscape_voiceStub.GetDestinationListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getDestinationList2 operation
   */
  public void receiveErrorgetDestinationList2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for isUpgradeAllowed method override this method for
   * handling normal response from isUpgradeAllowed operation
   */
  public void receiveResultisUpgradeAllowed(
      openscape_voice.Openscape_voiceStub.IsUpgradeAllowedResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * isUpgradeAllowed operation
   */
  public void receiveErrorisUpgradeAllowed(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryEndpointProvider method override this method for
   * handling normal response from queryEndpointProvider operation
   */
  public void receiveResultqueryEndpointProvider(
      openscape_voice.Openscape_voiceStub.EndpointProviderResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryEndpointProvider operation
   */
  public void receiveErrorqueryEndpointProvider(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for prioritizeRoute method override this method for
   * handling normal response from prioritizeRoute operation
   */
  public void receiveResultprioritizeRoute(
      openscape_voice.Openscape_voiceStub.PrioritizeRouteResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * prioritizeRoute operation
   */
  public void receiveErrorprioritizeRoute(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createClientFE method override this method for
   * handling normal response from createClientFE operation
   */
  public void receiveResultcreateClientFE(
      openscape_voice.Openscape_voiceStub.CreateClientFEResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createClientFE operation
   */
  public void receiveErrorcreateClientFE(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryLogServer method override this method for
   * handling normal response from queryLogServer operation
   */
  public void receiveResultqueryLogServer(
      openscape_voice.Openscape_voiceStub.QueryLogServerResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryLogServer operation
   */
  public void receiveErrorqueryLogServer(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyCallingLocation method override this method for
   * handling normal response from modifyCallingLocation operation
   */
  public void receiveResultmodifyCallingLocation(
      openscape_voice.Openscape_voiceStub.ModifyCallingLocationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyCallingLocation operation
   */
  public void receiveErrormodifyCallingLocation(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createPrefixAccessCode2 method override this method
   * for handling normal response from createPrefixAccessCode2 operation
   */
  public void receiveResultcreatePrefixAccessCode2(
      openscape_voice.Openscape_voiceStub.PrefixAccessCodeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createPrefixAccessCode2 operation
   */
  public void receiveErrorcreatePrefixAccessCode2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getEACockpitList method override this method for
   * handling normal response from getEACockpitList operation
   */
  public void receiveResultgetEACockpitList(
      openscape_voice.Openscape_voiceStub.GetEACockpitListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getEACockpitList operation
   */
  public void receiveErrorgetEACockpitList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createTrafficType method override this method for
   * handling normal response from createTrafficType operation
   */
  public void receiveResultcreateTrafficType(
      openscape_voice.Openscape_voiceStub.CreateTrafficTypeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createTrafficType operation
   */
  public void receiveErrorcreateTrafficType(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifySystemSipEntry method override this method for
   * handling normal response from modifySystemSipEntry operation
   */
  public void receiveResultmodifySystemSipEntry(
      openscape_voice.Openscape_voiceStub.SystemSipEntryResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifySystemSipEntry operation
   */
  public void receiveErrormodifySystemSipEntry(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getDestCodeList method override this method for
   * handling normal response from getDestCodeList operation
   */
  public void receiveResultgetDestCodeList(
      openscape_voice.Openscape_voiceStub.GetDestCodeListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getDestCodeList operation
   */
  public void receiveErrorgetDestCodeList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteCACGroup method override this method for
   * handling normal response from deleteCACGroup operation
   */
  public void receiveResultdeleteCACGroup(
      openscape_voice.Openscape_voiceStub.DeleteCACGroupResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteCACGroup operation
   */
  public void receiveErrordeleteCACGroup(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifySipReason method override this method for
   * handling normal response from modifySipReason operation
   */
  public void receiveResultmodifySipReason(
      openscape_voice.Openscape_voiceStub.ModifySipReasonResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifySipReason operation
   */
  public void receiveErrormodifySipReason(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getSubscriberList method override this method for
   * handling normal response from getSubscriberList operation
   */
  public void receiveResultgetSubscriberList(
      openscape_voice.Openscape_voiceStub.GetSubscriberListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getSubscriberList operation
   */
  public void receiveErrorgetSubscriberList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getBwUsageForGToGCACPolicy method override this
   * method for handling normal response from getBwUsageForGToGCACPolicy operation
   */
  public void receiveResultgetBwUsageForGToGCACPolicy(
      openscape_voice.Openscape_voiceStub.GetBwUsageForGToGCACPolicyResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getBwUsageForGToGCACPolicy operation
   */
  public void receiveErrorgetBwUsageForGToGCACPolicy(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getClientFE method override this method for handling
   * normal response from getClientFE operation
   */
  public void receiveResultgetClientFE(
      openscape_voice.Openscape_voiceStub.GetClientFEResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getClientFE operation
   */
  public void receiveErrorgetClientFE(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryBcastMembers method override this method for
   * handling normal response from queryBcastMembers operation
   */
  public void receiveResultqueryBcastMembers(
      openscape_voice.Openscape_voiceStub.QueryBcastMembersResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryBcastMembers operation
   */
  public void receiveErrorqueryBcastMembers(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeCommunityGroupMember method override this
   * method for handling normal response from removeCommunityGroupMember operation
   */
  public void receiveResultremoveCommunityGroupMember(
      openscape_voice.Openscape_voiceStub.RemoveCommunityGroupMemberResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeCommunityGroupMember operation
   */
  public void receiveErrorremoveCommunityGroupMember(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteEAGroup method override this method for
   * handling normal response from deleteEAGroup operation
   */
  public void receiveResultdeleteEAGroup(
      openscape_voice.Openscape_voiceStub.DeleteEAGroupResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteEAGroup operation
   */
  public void receiveErrordeleteEAGroup(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryCACPolicy method override this method for
   * handling normal response from queryCACPolicy operation
   */
  public void receiveResultqueryCACPolicy(
      openscape_voice.Openscape_voiceStub.QueryCACPolicyResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryCACPolicy operation
   */
  public void receiveErrorqueryCACPolicy(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for demoEnableFeatureSet method override this method for
   * handling normal response from demoEnableFeatureSet operation
   */
  public void receiveResultdemoEnableFeatureSet(
      openscape_voice.Openscape_voiceStub.DemoEnableFeatureSetResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * demoEnableFeatureSet operation
   */
  public void receiveErrordemoEnableFeatureSet(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createOperatorEnum method override this method for
   * handling normal response from createOperatorEnum operation
   */
  public void receiveResultcreateOperatorEnum(
      openscape_voice.Openscape_voiceStub.CreateOperatorEnumResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createOperatorEnum operation
   */
  public void receiveErrorcreateOperatorEnum(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryOriginDestination method override this method
   * for handling normal response from queryOriginDestination operation
   */
  public void receiveResultqueryOriginDestination(
      openscape_voice.Openscape_voiceStub.OriginDestinationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryOriginDestination operation
   */
  public void receiveErrorqueryOriginDestination(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateKeysetInfo2 method override this method for
   * handling normal response from updateKeysetInfo2 operation
   */
  public void receiveResultupdateKeysetInfo2(
      openscape_voice.Openscape_voiceStub.UpdateKeysetInfoResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateKeysetInfo2 operation
   */
  public void receiveErrorupdateKeysetInfo2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createAlias method override this method for handling
   * normal response from createAlias operation
   */
  public void receiveResultcreateAlias(
      openscape_voice.Openscape_voiceStub.CreateAliasResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createAlias operation
   */
  public void receiveErrorcreateAlias(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryCodeProcess method override this method for
   * handling normal response from queryCodeProcess operation
   */
  public void receiveResultqueryCodeProcess(
      openscape_voice.Openscape_voiceStub.CodeProcessResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryCodeProcess operation
   */
  public void receiveErrorqueryCodeProcess(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createNumberPlan2 method override this method for
   * handling normal response from createNumberPlan2 operation
   */
  public void receiveResultcreateNumberPlan2(
      openscape_voice.Openscape_voiceStub.NumberPlanResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createNumberPlan2 operation
   */
  public void receiveErrorcreateNumberPlan2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryLogClient method override this method for
   * handling normal response from queryLogClient operation
   */
  public void receiveResultqueryLogClient(
      openscape_voice.Openscape_voiceStub.QueryLogClientResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryLogClient operation
   */
  public void receiveErrorqueryLogClient(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyEsrpPolicy method override this method for
   * handling normal response from modifyEsrpPolicy operation
   */
  public void receiveResultmodifyEsrpPolicy(
      openscape_voice.Openscape_voiceStub.ModifyEsrpPolicyResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyEsrpPolicy operation
   */
  public void receiveErrormodifyEsrpPolicy(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createHeldServer method override this method for
   * handling normal response from createHeldServer operation
   */
  public void receiveResultcreateHeldServer(
      openscape_voice.Openscape_voiceStub.CreateHeldServerResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createHeldServer operation
   */
  public void receiveErrorcreateHeldServer(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getCpuGroupList method override this method for
   * handling normal response from getCpuGroupList operation
   */
  public void receiveResultgetCpuGroupList(
      openscape_voice.Openscape_voiceStub.GetCpuGroupListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getCpuGroupList operation
   */
  public void receiveErrorgetCpuGroupList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getFeatureProfile method override this method for
   * handling normal response from getFeatureProfile operation
   */
  public void receiveResultgetFeatureProfile(
      openscape_voice.Openscape_voiceStub.FeatureProfileResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getFeatureProfile operation
   */
  public void receiveErrorgetFeatureProfile(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeMediaGateway method override this method for
   * handling normal response from removeMediaGateway operation
   */
  public void receiveResultremoveMediaGateway(
      openscape_voice.Openscape_voiceStub.RemoveMediaGatewayResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeMediaGateway operation
   */
  public void receiveErrorremoveMediaGateway(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createAliDB method override this method for handling
   * normal response from createAliDB operation
   */
  public void receiveResultcreateAliDB(
      openscape_voice.Openscape_voiceStub.CreateAliDBResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createAliDB operation
   */
  public void receiveErrorcreateAliDB(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createCACGroup method override this method for
   * handling normal response from createCACGroup operation
   */
  public void receiveResultcreateCACGroup(
      openscape_voice.Openscape_voiceStub.CreateCACGroupResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createCACGroup operation
   */
  public void receiveErrorcreateCACGroup(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getBgSubnetList method override this method for
   * handling normal response from getBgSubnetList operation
   */
  public void receiveResultgetBgSubnetList(
      openscape_voice.Openscape_voiceStub.GetBgSubnetListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getBgSubnetList operation
   */
  public void receiveErrorgetBgSubnetList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createMediaGatewayCircuits method override this
   * method for handling normal response from createMediaGatewayCircuits operation
   */
  public void receiveResultcreateMediaGatewayCircuits(
      openscape_voice.Openscape_voiceStub.CreateMediaGatewayCircuitsResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createMediaGatewayCircuits operation
   */
  public void receiveErrorcreateMediaGatewayCircuits(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyCommunityGroup method override this method for
   * handling normal response from modifyCommunityGroup operation
   */
  public void receiveResultmodifyCommunityGroup(
      openscape_voice.Openscape_voiceStub.ModifyCommunityGroupResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyCommunityGroup operation
   */
  public void receiveErrormodifyCommunityGroup(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for upgradeFallback method override this method for
   * handling normal response from upgradeFallback operation
   */
  public void receiveResultupgradeFallback(
      openscape_voice.Openscape_voiceStub.UpgradeFallbackResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * upgradeFallback operation
   */
  public void receiveErrorupgradeFallback(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getStatusOfBuyFeatures method override this method
   * for handling normal response from getStatusOfBuyFeatures operation
   */
  public void receiveResultgetStatusOfBuyFeatures(
      openscape_voice.Openscape_voiceStub.GetStatusOfBuyFeaturesResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getStatusOfBuyFeatures operation
   */
  public void receiveErrorgetStatusOfBuyFeatures(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateBgSpeedDialListEntries method override this
   * method for handling normal response from updateBgSpeedDialListEntries operation
   */
  public void receiveResultupdateBgSpeedDialListEntries(
      openscape_voice.Openscape_voiceStub.UpdateBgSpeedDialListEntriesResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateBgSpeedDialListEntries operation
   */
  public void receiveErrorupdateBgSpeedDialListEntries(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyOriginDestination method override this method
   * for handling normal response from modifyOriginDestination operation
   */
  public void receiveResultmodifyOriginDestination(
      openscape_voice.Openscape_voiceStub.ModifyOriginDestinationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyOriginDestination operation
   */
  public void receiveErrormodifyOriginDestination(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeEsrpPolicy method override this method for
   * handling normal response from removeEsrpPolicy operation
   */
  public void receiveResultremoveEsrpPolicy(
      openscape_voice.Openscape_voiceStub.RemoveEsrpPolicyResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeEsrpPolicy operation
   */
  public void receiveErrorremoveEsrpPolicy(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeEndpoint method override this method for
   * handling normal response from removeEndpoint operation
   */
  public void receiveResultremoveEndpoint(
      openscape_voice.Openscape_voiceStub.RemoveEndpointResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeEndpoint operation
   */
  public void receiveErrorremoveEndpoint(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getBgSubnetInfo method override this method for
   * handling normal response from getBgSubnetInfo operation
   */
  public void receiveResultgetBgSubnetInfo(
      openscape_voice.Openscape_voiceStub.GetBgSubnetResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getBgSubnetInfo operation
   */
  public void receiveErrorgetBgSubnetInfo(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryTreatment method override this method for
   * handling normal response from queryTreatment operation
   */
  public void receiveResultqueryTreatment(
      openscape_voice.Openscape_voiceStub.TreatmentResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryTreatment operation
   */
  public void receiveErrorqueryTreatment(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getServiceGroup method override this method for
   * handling normal response from getServiceGroup operation
   */
  public void receiveResultgetServiceGroup(
      openscape_voice.Openscape_voiceStub.GetServiceGroupResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getServiceGroup operation
   */
  public void receiveErrorgetServiceGroup(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createRateArea method override this method for
   * handling normal response from createRateArea operation
   */
  public void receiveResultcreateRateArea(
      openscape_voice.Openscape_voiceStub.CreateRateAreaResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createRateArea operation
   */
  public void receiveErrorcreateRateArea(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getConfigData method override this method for
   * handling normal response from getConfigData operation
   */
  public void receiveResultgetConfigData(
      openscape_voice.Openscape_voiceStub.GetConfigDataResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getConfigData operation
   */
  public void receiveErrorgetConfigData(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for addBcastGroup method override this method for
   * handling normal response from addBcastGroup operation
   */
  public void receiveResultaddBcastGroup(
      openscape_voice.Openscape_voiceStub.AddBcastGroupResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * addBcastGroup operation
   */
  public void receiveErroraddBcastGroup(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getEAMemberAuxLineList method override this method
   * for handling normal response from getEAMemberAuxLineList operation
   */
  public void receiveResultgetEAMemberAuxLineList(
      openscape_voice.Openscape_voiceStub.GetEAMemberAuxLineListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getEAMemberAuxLineList operation
   */
  public void receiveErrorgetEAMemberAuxLineList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getEAGroupRelationshipList method override this
   * method for handling normal response from getEAGroupRelationshipList operation
   */
  public void receiveResultgetEAGroupRelationshipList(
      openscape_voice.Openscape_voiceStub.GetEAGroupRelationshipListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getEAGroupRelationshipList operation
   */
  public void receiveErrorgetEAGroupRelationshipList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createBGSuite method override this method for
   * handling normal response from createBGSuite operation
   */
  public void receiveResultcreateBGSuite(
      openscape_voice.Openscape_voiceStub.CreateBGSuiteResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createBGSuite operation
   */
  public void receiveErrorcreateBGSuite(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for cancelJob2 method override this method for handling
   * normal response from cancelJob2 operation
   */
  public void receiveResultcancelJob2(openscape_voice.Openscape_voiceStub.CancelJobResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * cancelJob2 operation
   */
  public void receiveErrorcancelJob2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getSubInfoByRel method override this method for
   * handling normal response from getSubInfoByRel operation
   */
  public void receiveResultgetSubInfoByRel(
      openscape_voice.Openscape_voiceStub.GetSubscriberResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getSubInfoByRel operation
   */
  public void receiveErrorgetSubInfoByRel(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryOriginRoute method override this method for
   * handling normal response from queryOriginRoute operation
   */
  public void receiveResultqueryOriginRoute(
      openscape_voice.Openscape_voiceStub.OriginRouteResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryOriginRoute operation
   */
  public void receiveErrorqueryOriginRoute(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createDestination method override this method for
   * handling normal response from createDestination operation
   */
  public void receiveResultcreateDestination(
      openscape_voice.Openscape_voiceStub.CreateDestinationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createDestination operation
   */
  public void receiveErrorcreateDestination(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getCACertificateStoreList method override this method
   * for handling normal response from getCACertificateStoreList operation
   */
  public void receiveResultgetCACertificateStoreList(
      openscape_voice.Openscape_voiceStub.GetCACertStoreListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getCACertificateStoreList operation
   */
  public void receiveErrorgetCACertificateStoreList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createCertificate method override this method for
   * handling normal response from createCertificate operation
   */
  public void receiveResultcreateCertificate(
      openscape_voice.Openscape_voiceStub.CreateCertificateResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createCertificate operation
   */
  public void receiveErrorcreateCertificate(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getStatCounterList method override this method for
   * handling normal response from getStatCounterList operation
   */
  public void receiveResultgetStatCounterList(
      openscape_voice.Openscape_voiceStub.GetCounterListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getStatCounterList operation
   */
  public void receiveErrorgetStatCounterList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for updateBgSpeedDialList method override this method for
   * handling normal response from updateBgSpeedDialList operation
   */
  public void receiveResultupdateBgSpeedDialList(
      openscape_voice.Openscape_voiceStub.UpdateBgSpeedDialListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * updateBgSpeedDialList operation
   */
  public void receiveErrorupdateBgSpeedDialList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for deleteDnmConversion method override this method for
   * handling normal response from deleteDnmConversion operation
   */
  public void receiveResultdeleteDnmConversion(
      openscape_voice.Openscape_voiceStub.DeleteDnmConversionResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * deleteDnmConversion operation
   */
  public void receiveErrordeleteDnmConversion(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyOpMode method override this method for handling
   * normal response from modifyOpMode operation
   */
  public void receiveResultmodifyOpMode(
      openscape_voice.Openscape_voiceStub.ModifyOpModeResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyOpMode operation
   */
  public void receiveErrormodifyOpMode(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryServiceGroups method override this method for
   * handling normal response from queryServiceGroups operation
   */
  public void receiveResultqueryServiceGroups(
      openscape_voice.Openscape_voiceStub.QueryServiceGroupsResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryServiceGroups operation
   */
  public void receiveErrorqueryServiceGroups(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createEAGroupMember method override this method for
   * handling normal response from createEAGroupMember operation
   */
  public void receiveResultcreateEAGroupMember(
      openscape_voice.Openscape_voiceStub.CreateEAGroupMemberResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createEAGroupMember operation
   */
  public void receiveErrorcreateEAGroupMember(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryTrafficTypeList method override this method for
   * handling normal response from queryTrafficTypeList operation
   */
  public void receiveResultqueryTrafficTypeList(
      openscape_voice.Openscape_voiceStub.QueryTrafficTypeListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryTrafficTypeList operation
   */
  public void receiveErrorqueryTrafficTypeList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getStatCounterInfo method override this method for
   * handling normal response from getStatCounterInfo operation
   */
  public void receiveResultgetStatCounterInfo(
      openscape_voice.Openscape_voiceStub.GetCounterInfoResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getStatCounterInfo operation
   */
  public void receiveErrorgetStatCounterInfo(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getCSTAActiveDeviceList method override this method
   * for handling normal response from getCSTAActiveDeviceList operation
   */
  public void receiveResultgetCSTAActiveDeviceList(
      openscape_voice.Openscape_voiceStub.GetCSTAActiveDeviceListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getCSTAActiveDeviceList operation
   */
  public void receiveErrorgetCSTAActiveDeviceList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createBG2 method override this method for handling
   * normal response from createBG2 operation
   */
  public void receiveResultcreateBG2(openscape_voice.Openscape_voiceStub.CreateBGResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createBG2 operation
   */
  public void receiveErrorcreateBG2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for assignTreatment method override this method for
   * handling normal response from assignTreatment operation
   */
  public void receiveResultassignTreatment(
      openscape_voice.Openscape_voiceStub.AssignTreatmentResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * assignTreatment operation
   */
  public void receiveErrorassignTreatment(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyEnumServer method override this method for
   * handling normal response from modifyEnumServer operation
   */
  public void receiveResultmodifyEnumServer(
      openscape_voice.Openscape_voiceStub.ModifyEnumServerResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyEnumServer operation
   */
  public void receiveErrormodifyEnumServer(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyIntercept method override this method for
   * handling normal response from modifyIntercept operation
   */
  public void receiveResultmodifyIntercept(
      openscape_voice.Openscape_voiceStub.ModifyInterceptResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyIntercept operation
   */
  public void receiveErrormodifyIntercept(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for addSubToMlhg2 method override this method for
   * handling normal response from addSubToMlhg2 operation
   */
  public void receiveResultaddSubToMlhg2(openscape_voice.Openscape_voiceStub.MlhgResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * addSubToMlhg2 operation
   */
  public void receiveErroraddSubToMlhg2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getNPListExtended method override this method for
   * handling normal response from getNPListExtended operation
   */
  public void receiveResultgetNPListExtended(
      openscape_voice.Openscape_voiceStub.GetNPListExtendedResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getNPListExtended operation
   */
  public void receiveErrorgetNPListExtended(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getRateAreaList2 method override this method for
   * handling normal response from getRateAreaList2 operation
   */
  public void receiveResultgetRateAreaList2(
      openscape_voice.Openscape_voiceStub.GetRateAreaListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getRateAreaList2 operation
   */
  public void receiveErrorgetRateAreaList2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryGToGCACPolicy method override this method for
   * handling normal response from queryGToGCACPolicy operation
   */
  public void receiveResultqueryGToGCACPolicy(
      openscape_voice.Openscape_voiceStub.QueryGToGCACPolicyResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryGToGCACPolicy operation
   */
  public void receiveErrorqueryGToGCACPolicy(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyTreatment method override this method for
   * handling normal response from modifyTreatment operation
   */
  public void receiveResultmodifyTreatment(
      openscape_voice.Openscape_voiceStub.ModifyTreatmentResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyTreatment operation
   */
  public void receiveErrormodifyTreatment(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getCertificate method override this method for
   * handling normal response from getCertificate operation
   */
  public void receiveResultgetCertificate(
      openscape_voice.Openscape_voiceStub.GetCertificateResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getCertificate operation
   */
  public void receiveErrorgetCertificate(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeOriginDestination method override this method
   * for handling normal response from removeOriginDestination operation
   */
  public void receiveResultremoveOriginDestination(
      openscape_voice.Openscape_voiceStub.RemoveOriginDestinationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeOriginDestination operation
   */
  public void receiveErrorremoveOriginDestination(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getBwUsageForCACPolicy method override this method
   * for handling normal response from getBwUsageForCACPolicy operation
   */
  public void receiveResultgetBwUsageForCACPolicy(
      openscape_voice.Openscape_voiceStub.GetBwUsageForCACPolicyResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getBwUsageForCACPolicy operation
   */
  public void receiveErrorgetBwUsageForCACPolicy(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createEndpointLocation method override this method
   * for handling normal response from createEndpointLocation operation
   */
  public void receiveResultcreateEndpointLocation(
      openscape_voice.Openscape_voiceStub.CreateEndpointLocationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createEndpointLocation operation
   */
  public void receiveErrorcreateEndpointLocation(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getCACPrimaryLinkStatus method override this method
   * for handling normal response from getCACPrimaryLinkStatus operation
   */
  public void receiveResultgetCACPrimaryLinkStatus(
      openscape_voice.Openscape_voiceStub.GetCACPrimaryLinkStatusResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getCACPrimaryLinkStatus operation
   */
  public void receiveErrorgetCACPrimaryLinkStatus(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createGToGCACPolicy method override this method for
   * handling normal response from createGToGCACPolicy operation
   */
  public void receiveResultcreateGToGCACPolicy(
      openscape_voice.Openscape_voiceStub.CreateGToGCACPolicyResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createGToGCACPolicy operation
   */
  public void receiveErrorcreateGToGCACPolicy(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyEndpoint method override this method for
   * handling normal response from modifyEndpoint operation
   */
  public void receiveResultmodifyEndpoint(
      openscape_voice.Openscape_voiceStub.ModifyEndpointResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyEndpoint operation
   */
  public void receiveErrormodifyEndpoint(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryWeeklySchedule method override this method for
   * handling normal response from queryWeeklySchedule operation
   */
  public void receiveResultqueryWeeklySchedule(
      openscape_voice.Openscape_voiceStub.WeeklyScheduleResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryWeeklySchedule operation
   */
  public void receiveErrorqueryWeeklySchedule(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeLocalCpuMembers method override this method for
   * handling normal response from removeLocalCpuMembers operation
   */
  public void receiveResultremoveLocalCpuMembers(
      openscape_voice.Openscape_voiceStub.RemoveLocalCpuMembersResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeLocalCpuMembers operation
   */
  public void receiveErrorremoveLocalCpuMembers(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getContTrcInfo method override this method for
   * handling normal response from getContTrcInfo operation
   */
  public void receiveResultgetContTrcInfo(
      openscape_voice.Openscape_voiceStub.GetContTrcInfoRes result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getContTrcInfo operation
   */
  public void receiveErrorgetContTrcInfo(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for removeSipTrustedEntityPorts method override this
   * method for handling normal response from removeSipTrustedEntityPorts operation
   */
  public void receiveResultremoveSipTrustedEntityPorts(
      openscape_voice.Openscape_voiceStub.SipTrustedEntityPortsResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * removeSipTrustedEntityPorts operation
   */
  public void receiveErrorremoveSipTrustedEntityPorts(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyDnmDefinition method override this method for
   * handling normal response from modifyDnmDefinition operation
   */
  public void receiveResultmodifyDnmDefinition(
      openscape_voice.Openscape_voiceStub.ModifyDnmDefinitionResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyDnmDefinition operation
   */
  public void receiveErrormodifyDnmDefinition(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyDnmLocalTollExchangeCodes method override this
   * method for handling normal response from modifyDnmLocalTollExchangeCodes operation
   */
  public void receiveResultmodifyDnmLocalTollExchangeCodes(
      openscape_voice.Openscape_voiceStub.ModifyDnmLocalTollExchangeCodesResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyDnmLocalTollExchangeCodes operation
   */
  public void receiveErrormodifyDnmLocalTollExchangeCodes(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for modifyDnmConversion method override this method for
   * handling normal response from modifyDnmConversion operation
   */
  public void receiveResultmodifyDnmConversion(
      openscape_voice.Openscape_voiceStub.ModifyDnmConversionResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * modifyDnmConversion operation
   */
  public void receiveErrormodifyDnmConversion(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for createDnmModification method override this method for
   * handling normal response from createDnmModification operation
   */
  public void receiveResultcreateDnmModification(
      openscape_voice.Openscape_voiceStub.CreateDnmModificationResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createDnmModification operation
   */
  public void receiveErrorcreateDnmModification(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getBGDeptList method override this method for
   * handling normal response from getBGDeptList operation
   */
  public void receiveResultgetBGDeptList(
      openscape_voice.Openscape_voiceStub.GetBGDeptListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getBGDeptList operation
   */
  public void receiveErrorgetBGDeptList(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for queryParkingLotInfo method override this method for
   * handling normal response from queryParkingLotInfo operation
   */
  public void receiveResultqueryParkingLotInfo(
      openscape_voice.Openscape_voiceStub.QueryParkingLotInfoResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * queryParkingLotInfo operation
   */
  public void receiveErrorqueryParkingLotInfo(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getPrefixAccessCodeList2 method override this method
   * for handling normal response from getPrefixAccessCodeList2 operation
   */
  public void receiveResultgetPrefixAccessCodeList2(
      openscape_voice.Openscape_voiceStub.PrefixAccessCodeListResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getPrefixAccessCodeList2 operation
   */
  public void receiveErrorgetPrefixAccessCodeList2(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getEsrpQueue method override this method for handling
   * normal response from getEsrpQueue operation
   */
  public void receiveResultgetEsrpQueue(
      openscape_voice.Openscape_voiceStub.GetEsrpQueueResult result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getEsrpQueue operation
   */
  public void receiveErrorgetEsrpQueue(java.lang.Exception e) {}
}
