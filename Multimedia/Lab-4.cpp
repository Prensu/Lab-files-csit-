#include<graphics.h>
int main(){
int gd = DETECT, gm, i;
initgraph(&gd,&gm,"");
for (i=10;1<=620; i++)
{
cleardevice();
setcolor(WHITE);
ellipse (100+i,200,0,360,50,16);
line (130+i, 185,110+i,155),
line (110+i,155,60+i,155),
line (60+i,155,80+i,185) ,
line (80+i, 215,60+i,245),
line (60+i,245,110+i,245) ;
line(110+i,245,130+i,215);
delay (10);
}
}
