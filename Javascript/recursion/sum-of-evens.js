
let sum  = 0;
function sumOfEvens(n){
    if(n == 0)
        return sum;

    if(n % 2 == 0)
        sum = sum + n;

    return sumOfEvens(n-1);
}

console.log(sumOfEvens(5));