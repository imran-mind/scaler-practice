let sum = 0
function sumOfDigits(n){
    if(n == 0)
        return sum;

    let rem = n % 10;
    sum = sum + rem;
    n = Math.floor(n / 10);
    return sumOfDigits(n);
}

console.log(sumOfDigits(123));