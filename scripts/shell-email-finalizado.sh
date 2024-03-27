sudo apt-get install mailutils
echo "Fim da instalacao"
echo "Pipeline Finalizado" 
mail -s "Pipeline Finalizado" fernando.b@ges.inatel.br <<< "O Pipeline com testes unitarios e build foi finalizado com sucesso"