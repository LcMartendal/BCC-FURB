import { Component } from '@angular/core';
import { Pessoa } from '../../interface/pessoa';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-cadastro',
  imports: [CommonModule, FormsModule],
  templateUrl: './cadastro.component.html',
  styleUrl: './cadastro.component.css'
})
export class CadastroComponent {
  pessoa: Pessoa = {
    nome: "Marcos",
    sobrenome: "Cardoso",
    cidade: "Blumenau"
  };

  mensagem: string = '';

  vetPessoa: Pessoa[] = [
    {
      nome: "Marcos",
      sobrenome: "Cardoso",
      cidade: "Blumenau"
    },
    {
      nome: "Dalton",
      sobrenome: "Reis",
      cidade: "Blumenau"
    },
    {
      nome: "Alexander",
      sobrenome: "Valdameri",
      cidade: "Joinville"
    }
  ];

  verificaTamanho(pString: string): void {
    this.mensagem = 'O tamanho de '+pString+' é de '+pString.length+' caracteres.';
  }

  trocaPessoa(pPessoa: Pessoa): void {
    this.pessoa = pPessoa;
  }
}
