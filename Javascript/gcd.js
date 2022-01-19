
function gcd(a,b){
    if(b == 0)
        return a;
    if(a == 0)
        return b;
    let n = Math.min(a,b);
    let g = 1;
    for(let i=1; i<=n; i++){
        if(a%i == 0 && b%i== 0){
            g = Math.max(i,g);
        }
    }
    console.log('GCD => ',g)
}

function gcd2(a,b){
    return b == 0 ? a : gcd2(b, a%b);
}

console.log(gcd2(3,9));