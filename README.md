# 🔍 Buscador de CEP

Aplicação Java que consome a **API ViaCEP** para buscar informações de endereço a partir de um CEP informado pelo usuário.  
Ao realizar a busca, o programa exibe o endereço no console e gera um arquivo `.json` com os dados obtidos.

---

## 🧠 Funcionalidades

- Consulta de endereço via **API ViaCEP**  
- Exibição dos dados formatados no console  
- Geração automática de arquivo **`endereco.json`**  
- Menu interativo no terminal  
- Tratamento de erros e CEP inválidos  

---

## 🧱 Estrutura do Projeto

📦 BuscadorDeCEP

┣ 📂 Dependencia

┃ ┣ 📜 gson-2.13.2.jar

┣ 📂 src

┃ ┣ 📜 Main.java

┃ ┣ 📜 CepService.java

┃ ┣ 📜 Endereco.java

┃ ┗ 📜 GeradorDeArquivo.java

┣ 📜 README.md

┣ 📜 endereco.json

---

## ⚙️ Tecnologias Utilizadas

- ☕ **Java 17+**
- 🌐 **HTTP Client (Java.net.http)**
- 🧩 **Gson (Google)** – para conversão JSON ↔ Objeto

---

## 🚀 Como Executar

Digite o CEP desejado e veja o resultado no console.
Um arquivo endereco.json será gerado automaticamente.

🧩 Exemplo de Saída

=== 🔍 Buscador de CEP ===

1️⃣ Buscar CEP

2️⃣ Sair

Escolha uma opção: 1

Digite o CEP (somente números): 01001000


📍 Endereço encontrado:

CEP: 01001-000

Logradouro: Praça da Sé

Bairro: Sé

Cidade: São Paulo

UF: SP

Complemento: lado ímpar


✅ Arquivo 'endereco.json' criado com sucesso!

---

👨‍💻 Autor

Romulo Chaves

📚 Estudante do programa Oracle Next Education (ONE)

🌎 Desenvolvedor em aprendizado — Java & Back-end

🔗 [GitHub](https://github.com/R6mulo)
🔗 [LinkedIn](https://linkedin.com/in/romulo-chaves)
☕ [Apoie no Ko-fi](https://ko-fi.com/r6rorschach)

---

📝 Licença

Este projeto é de uso livre para fins educacionais.
Sinta-se à vontade para clonar, modificar e melhorar! 🚀

---
