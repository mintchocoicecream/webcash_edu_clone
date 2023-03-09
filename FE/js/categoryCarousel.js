const nextBtn=document.querySelector(".categoryNextBtn");
const prevBtn=document.querySelector(".categoryPrevBtn");
const carousel=document.querySelector(".categoryList");

let idx=0;

if(idx==0){
    prevBtn.style.visibility="hidden";
}

prevBtn.addEventListener("click", function(){
    if(idx==0){
        return;
    }
    if(idx==1){
        prevBtn.style.visibility="hidden";
    }
    nextBtn.style.visibility="visible";
    idx-=1;
    carousel.style.transform=`translateX(${-400*idx}px)`;
});

nextBtn.addEventListener("click", function(){
    console.log(idx);
   if(idx==1){
        nextBtn.style.visibility="hidden";
    }
    prevBtn.style.visibility="visible";
    idx+=1;
    if(idx==1){
        carousel.style.transform=`translateX(${-500*idx}px)`;
    }else{
        carousel.style.transform=`translateX(${-350*idx}px)`;
    }
});