# 🔡 Analisador Léxico

Este módulo implementa o **Analisador Léxico** do compilador.  
O objetivo é **ler o código-fonte** escrito na interface e transformá-lo em **tokens**, que serão usados nas próximas etapas (sintática e semântica).

## ✨ Funcionalidades
- 🔎 Reconhecimento de:
  - **Identificadores**
  - **Palavras-chave**
  - **Números**
  - **Símbolos especiais** (como `+`, `-`, `=`, `;`, etc.)
- 🚫 Tratamento de **erros léxicos** (caracteres inválidos).
- 📋 Geração de lista de tokens.
- 📤 Integração com a interface (resultados aparecem na área de saída).

## 🚀 Como executar
1. Certifique-se de ter o **Java JDK 17+** instalado.
2. Compile o analisador:
   ```bash
   javac AnalisadorLexico.java
