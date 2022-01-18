
function decimalToBinary(dec){
    let binary='';
    while (dec > 0){
        let rem = dec % 2;
        binary = binary + rem;
        dec = Math.floor(dec/2);
    }
    return binary.split('').reverse().join('');
}

const res = decimalToBinary(32);
console.log(res);