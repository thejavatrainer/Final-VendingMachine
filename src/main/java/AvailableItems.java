public enum AvailableItems {

        COLA(1, 20),
        FANTA(2, 20),
        SPRITE(3, 20);

        public final Integer id;
        public final Integer price;

        private AvailableItems(Integer id, Integer price){
            this.price = price;
            this.id = id;
        }

        public Integer getid(){
            return id;
        }

        public Integer getPrice(){
            return price;
        }

}
