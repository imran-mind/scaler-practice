
function starPattern(n){
    let pattern = "";
    for(let i=1; i<=n; i++){
        // console.log(p)
        for(let j=i; j<n; j++){
            // console.log("-");
            pattern = pattern + " ";
        }
        for(let k=1; k<=(2*i-1); k++){
            pattern = pattern + "*"
        }
        pattern = pattern + "\n";
    }
    console.log(pattern);
}

// starPattern(3);

function oneZeroPattern(n){
    let pattern = "";
    for(let i=1; i<=n; i++){
        if(i%2 == 0){
            for(j=1; j<=i; j++){
                if(j%2 ==0 ){
                    pattern = pattern + " 1 ";
                }else{
                    
                    pattern = pattern + " 0 ";
                }
            }
            pattern = pattern + "\n";
        }else{
            for(j=1; j<=i; j++){
                if(j%2 ==0 ){
                    pattern = pattern + " 0 ";
                }else{
                    pattern = pattern + " 1 ";
                }
            }
            pattern = pattern + "\n";
        }
    }
    console.log(pattern);
}
oneZeroPattern(4)