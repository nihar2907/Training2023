package net.media.training.designpattern.adapter;

import net.media.training.designpattern.adapter.thirdparty.ThirdPartyLeaveRecord;

public class Adaptor implements LeaveRecord{
    private ThirdPartyLeaveRecord thirdPartyLeaveRecord;

    public Adaptor(ThirdPartyLeaveRecord thirdPartyLeaveRecord) {
        this.thirdPartyLeaveRecord = thirdPartyLeaveRecord;
    }

    @Override
    public String getMostAbsentEmployee() {
        return thirdPartyLeaveRecord.getMostAbsentEmployee().getName();
    }

    @Override
    public int getEmployeeAbsences(String employeeName) {
        return thirdPartyLeaveRecord.getEmployeeAbsences(employeeName);
    }
}
