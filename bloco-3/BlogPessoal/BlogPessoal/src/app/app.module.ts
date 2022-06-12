
import { HttpClientModule } from '@angular/common/http'
// IMPORTAR AQUI/\


import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { ModalModule } from 'ngx-bootstrap/modal';

import { HashLocationStrategy, LocationStrategy } from '@angular/common';
// /\ importa isso aqui pra funcionar href por id

import { AppComponent } from './app.component';
import { MenuComponent } from './menu/menu.component';
import { RodapeComponent } from './rodape/rodape.component';
import { HomeComponent } from './home/home.component';
import { CadastrarComponent } from './cadastrar/cadastrar.component';
import { EntrarComponent } from './entrar/entrar.component';

import { TemaComponent } from './tema/tema.component';
import { TemaEditComponent } from './edit/tema-edit/tema-edit.component';
import { TemaDeleteComponent } from './delete/tema-delete/tema-delete.component';
import { PerfilEditComponent } from './edit/perfil-edit/perfil-edit.component';
import { PerfilDeleteComponent } from './delete/perfil-delete/perfil-delete.component';
import { PostagemDeleteComponent } from './delete/postagem-delete/postagem-delete.component';
import { PostagemEditComponent } from './edit/postagem-edit/postagem-edit.component';
import { AlertasComponent } from './alertas/alertas.component';
import { OrderModule } from 'ngx-order-pipe';
import { UsuariosComponent } from './usuarios/usuarios.component';


@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    RodapeComponent,
    HomeComponent,
    CadastrarComponent,
    EntrarComponent,
    TemaComponent,
    TemaEditComponent,
    TemaDeleteComponent,
    PerfilEditComponent,
    PerfilDeleteComponent,
   PostagemDeleteComponent,
    PostagemEditComponent,
    AlertasComponent,
    UsuariosComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule, //iMPORTAR AQUI
    FormsModule, //AQUI funcionar inputs crud
    ModalModule.forRoot(), // funciona o ALERTA MODIFICADO
    OrderModule //order by
  ],
  providers: [{
    provide: LocationStrategy,
    useClass: HashLocationStrategy ///continuaçao pra funciona href por id
  }],
  bootstrap: [AppComponent]
})
export class AppModule { }
