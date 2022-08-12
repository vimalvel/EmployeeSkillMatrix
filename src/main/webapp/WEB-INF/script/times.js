/**
 * 
 */
 var timefrom = new Date();
temp = $('#startTime').val().split(":");
timefrom.setHours((parseInt(temp[0]) - 1 + 24) % 24);
timefrom.setMinutes(parseInt(temp[1]));

var timeto = new Date();
temp = $('#endTime').val().split(":");
timeto.setHours((parseInt(temp[0]) - 1 + 24) % 24);
timeto.setMinutes(parseInt(temp[1]));

if (timeto < timefrom){
    alert('start time should be smaller than end time!');
}