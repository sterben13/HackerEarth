function main4(data:string[]) {
    process.stdout.write(data[1].split(" ").indexOf(data[0])+"");
}

var stdin_input: string = "";
process.stdin.resume();
process.stdin.setEncoding("utf-8");

process.stdin.on("data", (input: string) => {
    stdin_input+=input;
});

process.stdin.on("end",()=>{
    main4(stdin_input.split("\n"));
})