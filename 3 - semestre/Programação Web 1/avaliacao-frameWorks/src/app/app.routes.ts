import { Routes } from '@angular/router';
import { HomeComponent } from './component/home/home.component';
import { CadastroFuncionariosComponent } from './component/cadastro-funcionarios/cadastro-funcionarios.component';

export const routes: Routes = [
    {
        path: "",
        component: HomeComponent
    },

    {
        path: "funcionarios",
        component: CadastroFuncionariosComponent
    }
];
