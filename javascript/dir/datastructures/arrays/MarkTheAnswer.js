"use strict";
function main5(data) {
    let [n, x] = data[0].split(" ").map(Number);
    let cont = 0, ix = 0;
    let array = data[1].split(" ");
    for (var i = 0; i < n; i++) {
        var e = parseInt(array[i]);
        if (e <= x) {
            cont++;
        }
        else if (e > x) {
            if (ix == 1) {
                break;
            }
            else {
                ix++;
            }
        }
    }
    process.stdout.write(cont + "\n");
}
var stdin_input = "";
process.stdin.resume();
process.stdin.setEncoding("utf-8");
process.stdin.on("data", (input) => {
    stdin_input += input;
});
process.stdin.on("end", () => {
    main5(stdin_input.split("\n"));
});
