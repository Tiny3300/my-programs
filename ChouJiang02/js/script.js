//var data = ['Phone7', 'Phone6', 'Phone5', '华为荣耀8', '华为P10',
//    '联想笔记本E580', '50元话费充值卡', '100元购物卡', 'iPad5', '魅族pro5', '金立手机M2017'];
var data=[1,2,3,4,5];
var time = null;
var flag=0;

window.onload = function () {
    var play = document.getElementById("play"),
        stop = document.getElementById("stop");

    //开始抽奖
    play.onclick = playFun;
    stop.onclick = stopFun;
    //键盘事件
    document.onkeyup= function (event) {
        event = event || window.event;
        if(event.keyCode==13){
            if(flag==0){
                playFun();
                flag=1;
            }else{
                stopFun();
                flag=0;
            }
        }
    }
}

function playFun() {
    clearInterval(time);
    var title = document.getElementById("title");
    var play = document.getElementById("play");

    time = setInterval(function () {
        var random = Math.floor(Math.random() * data.length);
        title.innerHTML = data[random];
    }, 50);

    play.style.background="#999";

}

function  stopFun(){
    clearInterval(time);
    var play=document.getElementById("play");
    play.style.background="#036";

}