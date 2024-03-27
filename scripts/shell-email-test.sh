sudo apt-get install mailutils
echo "Fim da instalacao"
echo "Comeco dos testes" 
mail -s "Testes no pipeline iniciados" ${vars.EMAILDESTINATARIO} <<< "Os testes unitarios pelo pipeline comecaram"