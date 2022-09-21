public class HrPromotion {
    public boolean isPromoteDueThisYear(Employee employee) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(employee.getDateOfJoining());
        return calendar.get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR);
    }
}
