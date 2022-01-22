

function inc(n){
    if(n==0)
        return;
    inc(n-1);
    console.log(n);
}

inc(5);