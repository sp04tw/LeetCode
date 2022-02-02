function solution(sequence) {
    let str = "6666";
    //let str="303";
    let len = str.length;
    let count = 0;
    for(let i = 0; i < len; i++)
    {
        let n = 0;
        for(let j = i; j < len; j++)
        {
            n = n * 10 + (str[j].charCodeAt() -'0'.charCodeAt());
            console.log(n);
            if (n % 3 == 0 && n!=0)
                count++;
        }
    } 
    console.log(count);
    return true;
}
