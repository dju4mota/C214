sudo apt-get install mailutils
echo "Fim da instalacao"
echo "Comeco dos testes" 
mail -s "Testes no pipeline iniciados" fernando.b@ges.inatel.br <<< "Os testes unitarios pelo pipeline comecaram"