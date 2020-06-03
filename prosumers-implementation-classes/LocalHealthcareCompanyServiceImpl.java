package eu.chorevolution.prosumer.localhealthcarecompany.business.impl.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

import eu.chorevolution.prosumer.localhealthcarecompany.FarmBusinessStartupRequest;
import eu.chorevolution.prosumer.localhealthcarecompany.FarmBusinessStartupResponse;
import eu.chorevolution.prosumer.localhealthcarecompany.FarmOpeningNotification;
import eu.chorevolution.prosumer.localhealthcarecompany.FarmRegistrationNotification;
import eu.chorevolution.prosumer.localhealthcarecompany.FarmSiteInspectionRequest;
import eu.chorevolution.prosumer.localhealthcarecompany.FarmSiteInspectionResponse;
import eu.chorevolution.prosumer.localhealthcarecompany.business.ChoreographyInstanceMessages;
import eu.chorevolution.prosumer.localhealthcarecompany.business.LocalHealthcareCompanyService;

@Service
public class LocalHealthcareCompanyServiceImpl implements LocalHealthcareCompanyService {

	@Override
	public void farmBusinessCodeRequest(FarmBusinessStartupRequest parameter, String choreographyTaskName, String senderParticipantName) {
		/**
		*	TODO Add your business logic upon the reception of FarmBusinessStartupRequest message from senderParticipantName
		*/
	}     

	@Override
	public void farmSiteInspectionVerbal(FarmSiteInspectionResponse parameter, String choreographyTaskName, String senderParticipantName) {
		/**
		*	TODO Add your business logic upon the reception of FarmSiteInspectionResponse message from senderParticipantName
		*/
	}     

	@Override
	public void farmBusinessStartupNotification(FarmRegistrationNotification parameter, String choreographyTaskName, String senderParticipantName) {
		/**
		*	TODO Add your business logic upon the reception of FarmRegistrationNotification message from senderParticipantName
		*/
	}     

    @Override
    public FarmSiteInspectionRequest createFarmSiteInspectionRequest(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName) {
 
    	FarmSiteInspectionRequest result = new FarmSiteInspectionRequest();
    	FarmBusinessStartupRequest farmBusinessStartupRequest = (FarmBusinessStartupRequest) choreographyInstanceMessages.getMessageReceivedFromParticipant("farmBusinessStartupRequest", "Local Healthcare Company", "Farm Business Code Request");    	
    	result.setBreedingMethodologyType(farmBusinessStartupRequest.getFarmBusinessStartupRequestForm().getFarm().getBreedingMethodologyType());
    	result.setCompanyName(farmBusinessStartupRequest.getFarmBusinessStartupRequestForm().getFarm().getCompanyName());
    	result.setFarmName(farmBusinessStartupRequest.getFarmBusinessStartupRequestForm().getFarm().getFarmName());
    	result.setFarmSurface(farmBusinessStartupRequest.getFarmBusinessStartupRequestForm().getFarm().getFarmSurface());
    	result.setProductionType(farmBusinessStartupRequest.getFarmBusinessStartupRequestForm().getFarm().getProductionType());
    	result.setSiteAddress(farmBusinessStartupRequest.getFarmBusinessStartupRequestForm().getFarm().getCompanyHeadquarter());
    	Calendar calendar = Calendar.getInstance();
    	calendar.add(Calendar.DAY_OF_MONTH, 30);
    	result.setSiteInspectionDeadline(calendar.getTime());
    	return result;
    }
    
    @Override
    public FarmOpeningNotification createFarmOpeningNotification(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName) {

    	FarmOpeningNotification result = new FarmOpeningNotification();
    	FarmBusinessStartupRequest farmBusinessStartupRequest = (FarmBusinessStartupRequest) choreographyInstanceMessages.getMessageReceivedFromParticipant("farmBusinessStartupRequest", "Local Healthcare Company", "Farm Business Code Request");    	
    	FarmSiteInspectionResponse farmSiteInspectionResponse = (FarmSiteInspectionResponse) choreographyInstanceMessages.getMessageReceivedFromParticipant("farmSiteInspectionResponse", "Local Healthcare Company", "Farm Site Inspection Verbal");    	    		
    	result.setFarmOpeningRequestForm(farmBusinessStartupRequest.getFarmBusinessStartupRequestForm());
    	result.setSiteInspectionDetails(farmSiteInspectionResponse.getSiteInspectionVerbal());
    	return result;
    }
    
    @Override
    public FarmBusinessStartupResponse createFarmBusinessStartupResponse(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName) {

    	FarmBusinessStartupResponse result = new FarmBusinessStartupResponse();
    	FarmRegistrationNotification farmRegistrationNotification = (FarmRegistrationNotification) choreographyInstanceMessages.getMessageReceivedFromParticipant("farmRegistrationNotification", "Local Healthcare Company", "Farm Business Startup Notification");     	    	
    	result.setFarmCode(farmRegistrationNotification.getFarmCode());
    	return result;
    }
    

}
