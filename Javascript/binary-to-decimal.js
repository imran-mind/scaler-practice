
function binaryToDecimal(binary){
    let pow = 0;
    let sum = 0;
    let bin = binary;
    while(bin > 0){
        console.log('bin before ',bin)
        let mod = bin % 2;
        console.log(mod)
        let dec = mod * Math.pow(2,pow);
        sum = sum + dec;
        bin = Math.floor(bin / 10);
        console.log('bin ',bin)
        pow++;
    }
    return sum;
}

const res = binaryToDecimal(11);
console.log(res);