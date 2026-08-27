# Objeto Notebook - Protegendo o Sistema

## 🌍 O que o objeto representa no mundo real?
A classe `Notebook` representa um **computador portátil físico** e seus recursos de hardware. No mundo real, esse objeto define as características e o estado da máquina em um dado momento: qual a sua marca, se ele possui energia na bateria, se está ligado, se possui capacidade no HD/SSD para salvar novos arquivos e se está conectado à internet.

## ⚙️ Como a classe funciona?
A classe foi desenhada com forte foco em **Encapsulamento e Proteção de Estado**. Todos os dados do notebook (marca, ligado, nível de bateria, espaço livre e Wi-Fi) são privados (`private`). O funcionamento da classe baseia-se em não permitir alterações diretas nesses dados, simulando as restrições do mundo físico. Toda interação passa obrigatoriamente pelos métodos públicos, que funcionam como "travas lógicas": eles aplicam rigorosas regras de negócio (usando `if`s) para garantir que o objeto nunca entre em um estado inconsistente ou impossível (como conectar ao Wi-Fi estando com o hardware desligado, ou ter um armazenamento negativo no disco).

## 🚀 Como usar os métodos criados

Aqui está o guia de como utilizar os principais métodos para manipular o estado do objeto `Notebook`:

### 1. `ligar()`
Utilizado para iniciar o sistema operacional da máquina.
*   **Regra:** O notebook não pode já estar ligado e precisa obrigatoriamente ter carga na bateria (maior que 0).
*   **Como usar:** `meuNotebook.ligar();`

### 2. `carregarBateria(double carga)`
Utilizado para simular a conexão do notebook na tomada e aumentar sua energia.
*   **Regra:** O valor inserido deve ser positivo e o nível do estado da bateria é limitado ao teto máximo de 100%.
*   **Como usar:** `meuNotebook.carregarBateria(80.0);`

### 3. `conectarWifi(String nomeRede)`
Utilizado para estabelecer conexão de rede sem fio.
*   **Regra:** O hardware do notebook precisa estar ligado, não pode já estar conectado a uma rede, e o nome da rede inserida deve ser válido (não nulo ou vazio).
*   **Como usar:** `meuNotebook.conectarWifi("Rede_Casa");`

### 4. `setEspacoLivreGb(int espacoLivreGb)`
Utilizado para redefinir o espaço de armazenamento disponível no disco.
*   **Regra (Regra Especial da Missão):** Bloqueia ativamente qualquer valor negativo. É impossível para um SSD físico possuir um espaço livre menor que 0 GB.
*   **Como usar:** `meuNotebook.setEspacoLivreGb(200);`
