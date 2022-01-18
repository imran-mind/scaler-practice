function numberPattern(n){
    let pattern ="";
    let val = 1;
    for(let i=1; i<=n; i++){

        for(let j=i; j<=n-1;j++){
            pattern = pattern + " ";
        }
        for(let k=1; k<=i; k++){
            pattern = pattern + val;
            // val = val + 1;
            val++;
        }
        console.log("=",val)
        let inner = val - 2;
        // val = val -2;
        for(let m=1; m<=i-1; m++){
            pattern = pattern+ inner;
            inner = inner - 1;
        }
        
        pattern = pattern + "\n";
        // val = val -1
        console.log("0",val)
    }
    console.log(pattern)
}

numberPattern(3);