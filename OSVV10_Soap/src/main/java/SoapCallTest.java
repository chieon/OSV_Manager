import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import openscape_voice.Openscape_voiceStub;
import openscape_voice.Openscape_voiceStub.AccountMgtInfo;
import openscape_voice.Openscape_voiceStub.BGName;
import openscape_voice.Openscape_voiceStub.CreateSubscriber2;
import openscape_voice.Openscape_voiceStub.CreateSubscriberReq2;
import openscape_voice.Openscape_voiceStub.CreateSubscriberRequest;
import openscape_voice.Openscape_voiceStub.CreateSubscriberResult;
import openscape_voice.Openscape_voiceStub.FeatureProfileId;
import openscape_voice.Openscape_voiceStub.GetSubInfoByRel;
import openscape_voice.Openscape_voiceStub.GetSubInfoRequest;
import openscape_voice.Openscape_voiceStub.GetSubscriberDataOptions;
import openscape_voice.Openscape_voiceStub.GetSubscriberInfo2;
import openscape_voice.Openscape_voiceStub.GetSubscriberInfoRequest;
import openscape_voice.Openscape_voiceStub.GetSubscriberList;
import openscape_voice.Openscape_voiceStub.GetSubscriberListData;
import openscape_voice.Openscape_voiceStub.GetSubscriberListEntry;
import openscape_voice.Openscape_voiceStub.GetSubscriberListRequest;
import openscape_voice.Openscape_voiceStub.GetSubscriberListResult;
import openscape_voice.Openscape_voiceStub.GetSubscriberResult;
import openscape_voice.Openscape_voiceStub.HiqGLOBALHEADER;
import openscape_voice.Openscape_voiceStub.HiqHEADER;
import openscape_voice.Openscape_voiceStub.PaginatedInfo;
import openscape_voice.Openscape_voiceStub.ResultCodeStruct;
import openscape_voice.Openscape_voiceStub.ServiceId;

public class SoapCallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Openscape_voiceStub osv=new Openscape_voiceStub("http://192.168.102.239:8767");
			GetSubscriberListRequest getSubListReq = new GetSubscriberListRequest();
			BGName bgName = new BGName();
			bgName.setBGName("GV24");
			getSubListReq.setBGName(bgName);
			GetSubscriberList GetSubscriberListEntryInfo = new GetSubscriberList();
			GetSubscriberListEntryInfo.setGetSubListReq(getSubListReq);
			HiqGLOBALHEADER globalHeader = new HiqGLOBALHEADER();
			globalHeader.setOperatorId("Axis2WSClient");
			HiqHEADER hiqHEADER = new HiqHEADER();
			hiqHEADER.setHiqHEADER(globalHeader);
			GetSubscriberListResult result = new GetSubscriberListResult();
			GetSubscriberListData listData = new GetSubscriberListData();
			result.setGetSubscriberListData(listData);
			/*
			try {
				result = osv.getSubscriberList(GetSubscriberListEntryInfo, hiqHEADER);
				int noOfSubs = result.getTotalSubsFound();
				System.out.println("\nBG Name: " + bgName);
				System.out.println("\nNumber of Subscribers: " + noOfSubs + "\n");
				GetSubscriberListEntry[] listEntries = new GetSubscriberListEntry[noOfSubs];
				listData = result.getGetSubscriberListData();
				listEntries = listData.getGetSubscriberListEntry();
				for(int i=0; i<noOfSubs; i++)
				System.out.println(listEntries[i].getServiceId());
			} catch (RemoteException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/

//			CreateSubscriberRequest subscriberReq=new CreateSubscriberRequest();
//			CreateSubscriberReq2 subscriberReq2=new CreateSubscriberReq2();
//
//			FeatureProfileId fp=new FeatureProfileId();
//			AccountMgtInfo accountMgtInfo=new AccountMgtInfo();


			//GetSubInfoRequest getSubInforequest=new GetSubInfoRequest();
			GetSubInfoByRel rel=new GetSubInfoByRel();
			GetSubscriberInfoRequest getSubInforequest=new GetSubscriberInfoRequest();
			GetSubscriberInfo2 info2=new GetSubscriberInfo2();
			GetSubInfoRequest gsr= new GetSubInfoRequest();



			ServiceId dn=new ServiceId();
			dn.setServiceId("88880397");
			getSubInforequest.setServiceId(dn);

			gsr.setServiceId(dn);
			rel.setGetSubInfoRequest(gsr);


			info2.setGetSubscriberInfoRequest(getSubInforequest);

			//rel.setGetSubInfoRequest(getSubInforequest);
			GetSubscriberResult info;
			try {
				System.out.println("------1");
//				osv.startgetSubscriberInfo2(info2, hiqHEADER, null);
				info=osv.getSubscriberInfo2(info2, hiqHEADER);


//				osv.getSubInfoByRel(rel, hiqHEADER);



				System.out.println("------2");

				System.out.println("------>"+info.getPrimaryDnInfo().getConnectionInfo().getIPPhone().getIPAddr());
				System.out.println("------>"+info.getPrimaryDnInfo().getListOfFeatures().getCfCSTA().getCstaType().getValue());
				System.out.println("------>"+info.getServiceId());
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}





		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
