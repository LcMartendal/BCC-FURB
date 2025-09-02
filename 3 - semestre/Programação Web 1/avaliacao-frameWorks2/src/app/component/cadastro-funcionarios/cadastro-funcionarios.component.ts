import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { CadastroService } from '../../service/cadastro.service';
import { Funcionario2 } from '../../interface/funcionario2';

@Component({
  selector: 'app-cadastro-funcionarios',
  imports: [CommonModule, FormsModule],
  templateUrl: './cadastro-funcionarios.component.html',
  styleUrl: './cadastro-funcionarios.component.css'
})
export class CadastroFuncionariosComponent {

  numeroId!: number;
  funcionario!: Funcionario2;
  funcionario2!:Funcionario2;
  mensagem: string = '';
  corMsg!: string;

  constructor(private cadastroService: CadastroService){}

  consultar(): void {
    this.cadastroService.consultaPorId(this.numeroId).subscribe({
      next: (f) => {
        if(f && f.id){
          this.funcionario = f;
          this.mensagem = '';
        }else{
          this.mensagem = 'Não encontrado!';
          this.corMsg = 'red';
          this.funcionario = undefined!;
        }
      },
      error: (err) => {
        this.mensagem = err.mensage;
        this.corMsg = err.status === 'Ok'? 'lightgreen': 'red';
      }
    })
  };

  excluir(): void {
    this.cadastroService.excluir(this.numeroId).subscribe(
      (f) => {
        this.funcionario = null!;
        this.mensagem = f.mensagem;
        this.corMsg = f.status === 'Ok'? 'lightgreen': 'red';
      }
    )
  }

  alterar(): void {
    this.cadastroService.alterar(this.funcionario).subscribe(
      (f) => {
        this.funcionario2 = f,
        this.mensagem = f.mensagem,
        this.corMsg = f.status === 'Ok'? 'lightgreen': 'red';
      }
    )
  }

}
