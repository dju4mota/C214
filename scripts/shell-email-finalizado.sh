sudo apt-get install mailutils
echo "Fim da instalacao"
echo "Pipeline Finalizado" 
echo "email:  $1"
mail -s "Pipeline Finalizado" "$1" <<< "O Pipeline com testes unitarios e build foi finalizado com sucesso"