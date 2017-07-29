"use strict";
function main4(data) {
    process.stdout.write(data[1].split(" ").indexOf(data[0]) + "");
}
var stdin_input = "";
process.stdin.resume();
process.stdin.setEncoding("utf-8");
process.stdin.on("data", (input) => {
    stdin_input += input;
});
process.stdin.on("end", () => {
    main4(stdin_input.split("\n"));
});
