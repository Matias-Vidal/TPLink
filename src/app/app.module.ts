import { GeneralesModule } from './generales/generales.module';
import { HeaderComponent } from './generales/header/header.component';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    GeneralesModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
