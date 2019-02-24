# Dynamic Link

"Deep links" são urls normais, mas que quando executados à partir de um celular, podem redirecionar o usuário para um aplicativo já no estado que o usuário espera, e caso o aplicativo não esteja instalado é possível redirecioná-lo para a loja para que o usuário execute o download. 
Mas para fazer isso funcionar muitos passos são necessários. 
Assim, o Firebase provê uma biblioteca para facilitar este trabalho, chamada de "Dynamic Link". 

Para mais informações do que o "Dynamic Link" oferece, acesse o site oficial: https://firebase.google.com/docs/dynamic-links/

## Sobre

Este projeto é dividido em duas partes:
* Um servidor que permite o usuário preencher alguns parâmetros para gerar um dynamic link.
* Um aplicativo que será executado ao clicar no link e exibirá os parâmetros fornecidos para o usuário.

## Executando o projeto

Para executar este projeto, é necessário:
* Criar uma conta no firebase
    * Nas configurações do projeto encontre a chave da API e a coloque como a variável de ambiente `DYNAMIC_LINK_FIREBASE_API_KEY`
* Configure um novo aplicativo no firebase para o pacote dev.badiale.dynamiclinkapp
    * Adicione o google-services.json na pasta `app`
* Configure um novo domínio no fireabse -> dynamic link
    * Adicione esse domínio na variável de ambiente `DYNAMIC_LINK_DOMAIN_URI`
    * Cria um arquivo de resources em `dynamiclinkapp/app/src/main/res/values` que contenha uma entrada de string com o nome `dynamic_link_domain` com o nome do domínio registrado no firebase.

Com este ambiente preparado, basta subir o servidor na pasta `dynamiclinkserver` com o comando `mvnw spring-boot:run`.
Com o servidor rodando, abra no browser a url `http://localhost:8080`, para gerar um dynamic link. 
Com este link, basta abrí-lo no celular, que você será redirecionado para a Play Store, para instalar seu aplicativo.
Caso seu aplicativo não esteja disponível da Play Store, basta instalá-lo no celular, e então abrir o link novamente.