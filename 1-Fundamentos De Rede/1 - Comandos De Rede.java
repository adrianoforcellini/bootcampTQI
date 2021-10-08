// Exercícios Práticos
// 1) Crie um arquivo de aularedes.txt
// 2) Exiba o número de IP da rede no terminal
// 3) Adicione a saída do comando anterior ao arquivo aula redes.txt
// 4) Exiba o número de IP Loopback no terminal
// 5) Adicione a saída do comando anterior ao arquivo aula redes.txt
// 6) Exiba Informações DNS sobre o host www.pudim.com.br
// 7) Adicione a saída do comando anterior ao arquivo aula redes.txt
// 8) Exiba Informações do Usuário logado na rede
// 9) Adicione a saída do comando anterior ao arquivo aula redes.txt
// 10) Execute um teste no host www.pudim.com.br com 6 pacotes
// 11) Adicione a saída do comando anterior ao arquivo aula redes.txt
// 12) Trace a Rota do seu computador até o host www.pudim.com.br
// 13) Adicione a saída do comando anterior ao arquivo aula redes.txt
// 14) Exiba Informações sobre Interfaces de Rede e Endereços IP no terminal
// 15) Adicione a saída do comando anterior ao arquivo aula redes.txt
// 16) Limpe o terminal
// 17) Imprima o arquivo aularedes.txt com paginação no terminal

// 1 - touch aularedes.txt

// 2 - hostname -I

// 3 - hostname -I >> aularedes.txt

// 4 - hostname -i 

// 5 - hostname -i >> aularedes.txt

// 6 - dig host www.pudim.com.br 

// 7 - echo -e '\n  ----Informaçoes DNS PUDIM.COM---- \n' >> aularedes.txt 
//     dig host www.pudim.com.br >> aularedes.txt 

// 8 e 9 - echo -e '\n  ----Informaçoes usuario da rede---- \n' >> aularedes.txt 
//      w   >> aularedes.txt 

// 10 e 11 - echo -e '\n --Teste no host www.pudim.com.br com 6 pacotes-- \n' >> aularedes.txt
//           ping pudim.com.br -w 6 >> aularedes.txt 

// 12 e 13 - echo -e '\n --Rota do meu computador até o host www.pudim.com.br- \n' >> aularedes.txt
//           traceroute www.pudim.com.br >> aularedes.txt

// 14 e 15 -  echo -e '\n --Informações sobre Interfaces de Rede e Endereços IP-- \n' >> aularedes.txt
//            ifconfig >> aularedes.txt

// 16 e 17 - clear && cat aularedes.txt