package solid.live.srp;

public class Refractor {
    public String toHtml(Employee e) {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + e.getEmpId() + "'>" +
                "<span>" + e.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>"+"<div class='right'><span>"
                + (e.getTotalLeaveAllowed() - e.getLeaveTaken()) + "</span>"
                +"<span>" + Math.round(e.getMonthlySalary() * 12) + "</span>";
        if (e.getManager() != null) str += "<span>" + e.getManager() + "</span>";
        else str += "<span>None</span>";
        int years = 3;
        if (e.getYearsInOrg() < 3) {
            years = e.getYearsInOrg();
        }
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += e.getLeavesLeftPreviously()[e.getYearsInOrg()-i-1];
        }
        str += "<span>" + totalLeaveLeftPreviously + "</span>";
        return str + "</div> </div>";
    }


}
