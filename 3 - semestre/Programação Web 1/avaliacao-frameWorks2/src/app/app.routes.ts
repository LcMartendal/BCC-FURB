import { Routes } from '@angular/router';
import { HomeComponent } from './component/home/home.component';
import { CadastroFuncionariosComponent } from './component/cadastro-funcionarios/cadastro-funcionarios.component';
import { FuncionariosComponent } from './component/funcionarios/funcionarios.component';

export const routes: Routes = [
    {
        path: "",
        component: HomeComponent
    },

    {
        path: "funcionarios",
        component: FuncionariosComponent
    },

    {
        path: "cadastro",
        component: CadastroFuncionariosComponent
    }
];
