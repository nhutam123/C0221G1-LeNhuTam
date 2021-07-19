let a=0;
let b=1;
let c=0;
let sum=a+b;
let ketQua=a+","+b;
for (let i=1;i<10;i++){
    c=a+b;
    ketQua += ","+c;
    sum+=c;
    a=b;
    b=c;
}

console.log("tong là" +sum);
