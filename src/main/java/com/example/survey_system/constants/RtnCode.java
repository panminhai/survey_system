package com.example.survey_system.constants;



public enum RtnCode {

    SUCCESSFUL("200","Successful!!"),
    CANNOT_EMPTY("400","Data is empty!!!"),
	CONTENT_EMPTY("400", "The commoditys list is Empty!!"),

	NUMBER_ERROR("400", "Commodity Number is Overlap!!"),
    DATA_ERROR("400","Data is error!!!"),
    DATA_DUPLICATE("400","Data is duplicate"),
    NOT_FOUND("404","Not found!!!"),

	CAN_NOT_DELETE("400","Order Can not Delete !"),
	DELETE_OTHER_USER("400", "Can't delete other user account!!"),
	PLEASE_LOGIN_FIRST("400","Please Login First !"),
//	------------------------------------------------------
//	surveyProject
    NOTITLE("402","Please insert Survey Title!"),
    START_END_DATE("402", "StartTime should earlier then EndTime!!"),
    DATEFORMAT_ERROR("402","Please insert correct DateFromat!!");
	
	
//	------------------------------------------------------

    private String code;
    private String message;
//=======================================================================================

    RtnCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    RtnCode() {
    }

    //========================================================================================

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
