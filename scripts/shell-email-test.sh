sudo apt-get install mailutils
echo "Fim da instalacao"
echo "Comeco dos testes" 
echo $email_destinatario
mail -s "Testes no pipeline iniciados" $email_destinatario <<< "Os testes unitarios pelo pipeline comecaram"