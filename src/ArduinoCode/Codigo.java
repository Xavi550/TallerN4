//Codigo esta encapsulado como comentario

/*#include <ESP8266WiFi.h>
#include "WiFiClient.h"

#define WIFI_SSID "Xavi"
#define WIFI_PASSWORD "987654321"

//const char* ssid = "Xavi";
//const char* password = "987654321";
//const char* host = "192.168.100.13";

#define pullOpen 0
#define pullClose 4
#define led 5


void setup(){
  Serial.begin(115200);
  pinMode(led, OUTPUT);
  pinMode(pullOpen, INPUT);
  pinMode(pullClose, INPUT);

  Serial.println();
  Serial.println();
  Serial.print("Conectando con ");
  Serial.println(WIFI_SSID);
  WiFi.mode(WIFI_STA);
  delay(100);
  WiFi.begin(WIFI_SSID, WIFI_PASSWORD);
  while (WiFi.status() != WL_CONNECTED){

    delay(100);
    Serial.print(".");
  }
  Serial.println("");
  Serial.println(WiFi.localIP());

}

void loop(){

  Door();
  Java();
}

/// Desde Java
char msm;
void Java(){

  if (Serial.available() >0){
    msm= Serial.read();
    if (msm == '1'){
      digitalWrite(led, HIGH);
      delay(800);
      digitalWrite(led, LOW);
    }
    else {
      digitalWrite(led, HIGH);
      delay(800);
      digitalWrite(led, LOW);
      delay(250);
      digitalWrite(led, HIGH);
      delay(800);
      digitalWrite(led, LOW);
    

    }


  }
}
/// Control
void Door(){
  bool open = true;
  bool close = false;

  if (digitalRead(pullOpen) == HIGH){
    digitalWrite(led, HIGH);
    delay(800);
    digitalWrite(led, LOW);
    Serial.print(open);
  }
  else if (digitalRead(pullClose) == HIGH)
  {
      digitalWrite(led, HIGH);
      delay(800);
      digitalWrite(led, LOW);
      delay(250);
      digitalWrite(led, HIGH);
      delay(800);
      digitalWrite(led, LOW);
      Serial.print(close);
    

  }

}*/