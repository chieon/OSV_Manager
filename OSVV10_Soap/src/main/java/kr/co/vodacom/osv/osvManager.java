package kr.co.vodacom.osv;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.commons.logging.impl.Log4JLogger;

import kr.co.vodacom.config.OSVProperties;
import openscape_voice.Openscape_voiceStub;
import openscape_voice.Openscape_voiceStub.GetSubscriberInfo2;
import openscape_voice.Openscape_voiceStub.GetSubscriberInfoRequest;
import openscape_voice.Openscape_voiceStub.GetSubscriberResult;
import openscape_voice.Openscape_voiceStub.HiqGLOBALHEADER;
import openscape_voice.Openscape_voiceStub.HiqHEADER;
import openscape_voice.Openscape_voiceStub.ServiceId;

public class osvManager {
//	static Log4JLogger osvLogger=(Log4JLogger)LogFactory.getLog("process.osvManager");
	static Logger osvLogger = LogManager.getLogger("process.osvManager");

	private boolean connected;
	private Openscape_voiceStub osv;
	private HiqHEADER hiqHEADER;

	private OSVProperties osvpro;

	public osvManager(String path) {
		HiqGLOBALHEADER globalHeader = new HiqGLOBALHEADER();
		connected=false;
		hiqHEADER = new HiqHEADER();
		globalHeader.setOperatorId("osvManager");
		hiqHEADER.setHiqHEADER(globalHeader);
		osvpro=new OSVProperties();
		if(osvpro.init_done==false)
		{
			osvpro.init(path);
		}
	}

	public boolean connect() {
		try {
			osv=new Openscape_voiceStub("http://"+osvpro.config.getProperty("apiIP")+":"+osvpro.config.getProperty("apiPort"));
			//osv = new Openscape_voiceStub("http://192.168.102.239:8767");
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			osvLogger.info(e.getMessage());
			return false;
		}
		this.connected=true;
		return connected;
	}

	public boolean isConnectedc() {
		return connected;
	}

	public void getInfo1(String seviceId) {
		GetSubscriberInfo2 info=new GetSubscriberInfo2();
		GetSubscriberInfoRequest req=new GetSubscriberInfoRequest();
		GetSubscriberResult rst;
		ServiceId dn=new ServiceId();
		dn.setServiceId(seviceId);
		req.setServiceId(dn);
		info.setGetSubscriberInfoRequest(req);
		try {
			rst=osv.getSubscriberInfo2(info, hiqHEADER);
			osvLogger.error("------>"+rst.getServiceId());
			osvLogger.error("------>"+rst.getPrimaryDnInfo().getConnectionInfo().getIPPhone().getIPAddr());
		}
		catch(RemoteException e) {
			osvLogger.error(e.getMessage());
		}
	}

	public void getInfo2(String seviceId) {
		GetSubscriberInfo2 info=new GetSubscriberInfo2();
		GetSubscriberInfoRequest req=new GetSubscriberInfoRequest();
		GetSubscriberResult rst;
		ServiceId dn=new ServiceId();
		dn.setServiceId(seviceId);
		req.setServiceId(dn);
		info.setGetSubscriberInfoRequest(req);
		try {
			rst=osv.getSubscriberInfo2(info, hiqHEADER);
			osvLogger.error("------>"+rst.getServiceId());
			osvLogger.error("------>"+rst.getPrimaryDnInfo().getConnectionInfo().getIPPhone().getIPAddr());
		}
		catch(RemoteException e) {
			osvLogger.error(e.getMessage());
		}
	}

	/*************************************
	 *  Functions for OSV V8 osvManager  *
	 *  **********************************
	 */
};//end of class : osvManager
