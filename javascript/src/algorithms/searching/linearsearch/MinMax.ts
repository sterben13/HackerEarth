function main2(data: string[]) {
    let min = 2e10;
    let max = 0;
    let t = parseInt(data[0]);
    let sum = data[1].split(" ").map(Number).reduce((previous, current, i, a) => {
        return previous + current;
    });
    let a:number[] = data[1].split(" ").map(Number).sort();
    process.stdout.write((sum-a[t-1])+" "+(sum-a[0])+"\n");
}

var stdin_input: string = "";
process.stdin.resume()
process.stdin.setEncoding("utf-8");

process.stdin.on("data", (input: string) => {
    stdin_input+=input;
});

process.stdin.on("end", () => {
    main2(stdin_input.split("\n"));
});

