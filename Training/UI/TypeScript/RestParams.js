function restfunction() {
    var msg = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        msg[_i] = arguments[_i];
    }
    return 'Parameters are: ' + " " + msg.join(" ");
}
console.log(restfunction());
console.log(restfunction('Rest', 'Parameters'));
console.log(restfunction("Example", 'of', 'Rest', 'parameters'));
