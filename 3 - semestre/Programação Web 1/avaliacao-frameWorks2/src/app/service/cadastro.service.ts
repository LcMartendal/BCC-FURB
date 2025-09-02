import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Funcionario2 } from '../interface/funcionario2';

@Injectable({
  providedIn: 'root'
})
export class CadastroService {

  constructor(private httpClient: HttpClient) {}

  consultaPorId(id: number): Observable<Funcionario2> {
    return this.httpClient.get<Funcionario2>('https://bu.furb.br/mcardoso/progWeb/apiRestAval.php/cadastro/' + id);
  };

  excluir(id: number): Observable<any> {
    return this.httpClient.delete<void>('https://bu.furb.br/mcardoso/progWeb/apiRestAval.php/cadastro/' + id);
  };

  alterar(f: Funcionario2): Observable<any> {
    return this.httpClient.put<void>('https://bu.furb.br/mcardoso/progWeb/apiRestAval.php/cadastro/' + f.id, f);
  }
}
