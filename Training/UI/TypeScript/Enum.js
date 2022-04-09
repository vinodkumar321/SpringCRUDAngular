var days;
(function (days) {
    days[days["Monday"] = 1] = "Monday";
    days[days["Tuesday"] = 2] = "Tuesday";
    days[days["Weekend"] = 0] = "Weekend";
})(days || (days = {}));
console.log(days.Tuesday);
function weekend(day) {
    if (day === 'Saturday' || day === 'Sunday') {
        return days.Weekend;
    }
}
var day = weekend('Saturday');
console.log(day);
