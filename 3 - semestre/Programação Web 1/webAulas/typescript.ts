var x = 5;
//x = 'Blumenau';
var y: number;
//y = 'Blumenau';
var z: any;
z = true;
z = 'Blumenau';
z = 3.1415;
z = { nome: "Marcos" };
var variado: string | number;
variado = 'Marcos';
variado = 1;
//variado = false;
type Cidade = "Blumenau" | "Gaspar" | "Itajaí";
var vCidade: Cidade;
vCidade = 'Blumenau';
//vCidade = 'Indaial';
type OutroTipo = "Marcos" | 5 | false;
var vOutroTipo: OutroTipo;
vOutroTipo = 5;
//vOutroTipo = 6;
//vOutroTipo = true;

class Pessoa {
    private nome: string;
    sobrenome: string;
    cidade: string;
    constructor(pNome: string, pSobrenome: string, pCidade: string) {
        this.nome = pNome;
        this.sobrenome= pSobrenome;
        this.cidade = pCidade;
    }
    
    getNome(): string {
        return this.nome;
    }

    setNome(pNome: string): void {
        this.nome = pNome;
    }
}

var vPessoa: Pessoa;
vPessoa = new Pessoa('Marcos', 'Cardoso', 'Blumenau');
//vPessoa.nome = 'Pedro';
vPessoa.setNome('Pedro');
console.log(vPessoa);

function mostraConsole(pMensagem: any): void {
    console.log(pMensagem);
}

mostraConsole('BCC');
mostraConsole(3.1415);
mostraConsole([ 1, 2, 3 ]);

function fDuplica(pNumero: number): number {
    return pNumero*2;
}

mostraConsole(fDuplica(4));

function funcao(pParametro: string | number): void {
    if (typeof pParametro === "string") {
        console.log(pParametro+" é string");
    }
    if (typeof pParametro === "number") {
        console.log(pParametro+" é number");
    }
}

funcao("Blumenau");
funcao(10);
funcao("10");

var vObjeto: object;
vObjeto = { nome: "Marcos" };
vObjeto = { livros: [
    { titulo: "Harry Potter" },
    { titulo: "Senhor dos anéis" },
    { titulo: "Banco de dados" }
] };
vObjeto = new Pessoa("Dalton", "Reis", "Blumenau");
vObjeto = new Date();

var vetor1: Array<string> = [ "Marcos", "Blumenau", "FURB" ];
var vetor2: Array<any> = [ 1, false, { cidade: "Blumenau" }, "Itajaí" ];
var vetor3: Array<boolean | object> = [ true, false, true, { carro: "FIAT" } ];
var vetor4: Array<Pessoa> = [
    new Pessoa("Marcos", "Cardoso", "Blumenau"),
    new Pessoa("Dalton", "Reis", "Blumenau"),
    new Pessoa("Alexander", "Valdameri", "Joinville")
];
console.log(vetor4);

interface Int1 {
    propriedade1: string,
    propriedade2: number,
    propriedade3: string | boolean
}

var vInt1: Int1 = {
    propriedade1: "Propriedade1",
    propriedade2: 10,
    propriedade3: true
};
console.log(vInt1.propriedade1);
console.log(vInt1.propriedade2);
console.log(vInt1.propriedade3);
vInt1.propriedade1 = "Outro valor";

interface Int2<Tipo> {
    propriedade1: Tipo,
    propriedade2: number
}

var vInt2: Int2<string> = {
    propriedade1: "Marcos",
    propriedade2: 10
};
var vInt2_1: Int2<boolean> = {
    propriedade1: true,
    propriedade2: 1000
};

interface Int3<Tipo1,Tipo2> {
    propriedade1: Tipo1,
    propriedade2: Tipo2
}

var vInt3: Int3<string, number> = {
    propriedade1: "Blumenau",
    propriedade2: 10
};
var vInt3_1: Int3<boolean, number | string> = {
    propriedade1: true,
    propriedade2: 100
}
vInt3_1.propriedade2 = "SC";
