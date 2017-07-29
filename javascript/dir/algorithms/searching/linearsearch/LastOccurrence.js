"use strict";
function main1(input) {
    let data = input.split("\n");
    let [m, n] = data[0].split(" ");
    let array = data[1].split(" ");
    let imp = -1;
    array.forEach((v, i) => {
        if (v == n) {
            imp = i + 1;
            return;
        }
    });
    process.stdout.write(imp + "\n");
}
var stdin_input = "";
process.stdin.resume();
process.stdin.setEncoding('utf-8');
process.stdin.on('data', (input) => {
    stdin_input += input;
});
process.stdin.on('end', () => {
    main1(stdin_input);
});
