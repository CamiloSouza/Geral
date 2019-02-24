Os arquivos infocom_model_novo.txt e RealityConnectionTraceFinal_novo.txt
tiveram o tempo de cada conexão alterado. Isto foi feito com o script
mudar_infocom.sh que recebe o arquivo a ser alterado como parâmetro e apresenta
na saída padrão as novas informações - o tempo de cada conexão foi subtraído do
tempo da primeiro conexão do arquivo, então se este valor for zero, nada será
alterado.

O script duplicar.sh recebe como parâmetro um arquivo de mobilidade e apresenta
na saída padrão as informações do mesmo arquivo, mas replicadas 101 vezes.
