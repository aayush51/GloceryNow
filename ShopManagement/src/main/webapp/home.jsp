<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>GloceryNow - Home</title>
<style type="text/css">
body {
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
}

.container {
	max-width: 1200px;
	margin: 40px auto;
	padding: 20px;
	background-color: #f9f9f9;
	border: 1px solid #ddd;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.categories {
	background-color: #f0f0f0;
	padding: 20px;
	border-bottom: 1px solid #ddd;
}

.categories ul {
	list-style: none;
	margin: 0;
	padding: 0;
}

.categories li {
	display: inline-block;
	margin-right: 20px;
}

.categories a {
	text-decoration: none;
	color: #337ab7;
}

.categories a:hover {
	color: #23527c;
}

.products {
	margin-top: 20px;
}

.row {
	display: flex;
	flex-wrap: wrap;
	justify-content: center;
}

.col-md-3 {
	width: 25%;
	margin: 10px;
}

.card {
	background-color: #fff;
	padding: 20px;
	border: 1px solid #ddd;
	border-radius: 10px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.card img {
	width: 100%;
	height: 150px;
	object-fit: cover;
	border-radius: 10px 10px 0 0;
}

.card h3 {
	font-weight: bold;
	margin-top: 10px;
}

.card p {
	margin-bottom: 10px;
}

.card button {
	background-color: #337ab7;
	color: #fff;
	border: none;
	padding: 10px 20px;
	font-size: 16px;
	cursor: pointer;
}

.card button:hover {
	background-color: #23527c;
}

.cart-button {
	position: fixed;
	top: 20px;
	right: 20px;
	z-index: 1;
	background-color: #337ab7;
	color: #fff;
	border: none;
	padding: 10px 20px;
	font-size: 16px;
	cursor: pointer;
	background-color: #337ab7
}

.cart-button:hover {
	background-color: #23527c;
}

.cart-sidebar {
	position: fixed;
	top: 0;
	right: 0;
	width: 300px;
	height: 100vh;
	padding: 20px;
	background-color: #fff;
	border: 1px solid #ddd;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	transform: translateX(100%);
	transition: transform 0.3s ease-in-out;
	background-color: #fff;
}

.cart-sidebar.open {
	transform: translateX(0);
}

.categories {
	background-color: #f7f7f7;
	padding: 20px;
	border-bottom: 1px solid #ccc;
}

.categories ul {
	list-style: none;
	margin: 0;
	padding: 0;
}

.categories li {
	display: inline-block;
	margin-right: 20px;
}

.categories a {
	text-decoration: none;
	color: #337ab7;
}

.categories a:hover {
	color: #23527c;
}

.categories a.active {
	color: #23527c;
	border-bottom: 2px solid #337ab7;
}
</style>
</head>
<body>
	<div class="container">
		<h1>GloceryNow - Home</h1>
		<div class="categories">
			<h2>Categories</h2>
			<ul>
				<li><a href="#fruits">Fruits</a></li>
				<li><a href="#vegetables">Vegetables</a></li>
				<li><a href="#dairy">Dairy</a></li>
				<li><a href="#meat">Meat</a></li>
				<li><a href="#poultry">Poultry</a></li>
			</ul>
		</div>
		<div class="products">
			<h2 id="fruits">Fruits</h2>
			<div class="row">
				<div class="col-md-3">
					<div class="card">
						<img src="images/apple.jpg" alt="Apple">
						<h3>Apple</h3>
						<p class="price">Price: $1.99</p>
						<p class="quantity">Quantity: 1 kg</p>
						<p>Category: Fruits</p>
						<button class="add-to-cart" onclick="addInCart(this)">Add
							to Cart</button>
					</div>
				</div>
				<div class="col-md-3">
					<div class="card">
						<img src="images/banana.jpg" alt="Banana">
						<h3>Banana</h3>
						<p class="price">Price: $0.99</p>
						<p class="quantity">Quantity: 1 kg</p>
						<p>Category: Fruits</p>
						<button class="add-to-cart" onclick="addInCart(this)">Add
							to Cart</button>
					</div>
				</div>
				<div class="col-md-3">
					<div class="card">
						<img src="images/orange.jpg" alt="Orange">
						<h3>Orange</h3>
						<p class="price">Price: $1.49</p>
						<p class="quantity">Quantity: 1 kg</p>
						<p>Category: Fruits</p>
						<button class="add-to-cart" onclick="addInCart(this)">Add
							to Cart</button>
					</div>
				</div>
			</div>
			<h2 id="vegetables">Vegetables</h2>
			<div class="row">
				<div class="col-md-3">
					<div class="card">
						<img src="images/carrot.jpg" alt="Carrot">
						<h3>Carrot</h3>
						<p class="price">Price: $1.49</p>
						<p class="quantity">Quantity: 1 kg</p>
						<p>Category: Vegetables</p>
						<button class="add-to-cart" onclick="addInCart(this)">Add
							to Cart</button>
					</div>
				</div>
				<div class="col-md-3">
					<div class="card">
						<img src="images/broccoli.jpg" alt="Broccoli">
						<h3>Broccoli</h3>
						<p class="price">Price: $1.99</p>
						<p class="quantity">Quantity: 1 kg</p>
						<p>Category: Vegetables</p>
						<button class="add-to-cart" onclick="addInCart(this)">Add
							to Cart</button>
					</div>
				</div>
				<div class="col-md-3">
					<div class="card">
						<img src="images/cauliflower.jpg" alt="Cauliflower">
						<h3>Cauliflower</h3>
						<p class="price">Price: $1.99</p>
						<p class="quantity">Quantity: 1 kg</p>
						<p>Category: Vegetables</p>
						<button class="add-to-cart" onclick="addInCart(this)">Add
							to Cart</button>
					</div>
				</div>
			</div>
			<h2 id="dairy">Dairy</h2>
			<div class="row">
				<div class="col-md-3">
					<div class="card">
						<img src="images/milk.jpg " alt="Milk">
						<h3>Milk</h3>
						<p class="price">Price: $2.99</p>
						<p class="quantity">Quantity: 1 liter</p>
						<p>Category: Dairy</p>
						<button class="add-to-cart" onclick="addInCart(this)">Add
							to Cart</button>
					</div>
				</div>
				<div class="col-md-3">
					<div class="card">
						<img src="images/cheese.jpg" alt="Cheese">
						<h3>Cheese</h3>
						<p class="price">Price: $3.99</p>
						<p class="quantity">Quantity: 1 kg</p>
						<p>Category: Dairy</p>
						<button class="add-to-cart" onclick="addInCart(this)">Add
							to Cart</button>
					</div>
				</div>
				<div class="col-md-3">
					<div class="card">
						<img src="images/yogurt.jpg" alt="Yogurt">
						<h3>Yogurt</h3>
						<p class="price">Price: $2.99</p>
						<p class="quantity">Quantity: 1 kg</p>
						<p>Category: Dairy</p>
						<button class="add-to-cart" onclick="addInCart(this)">Add
							to Cart</button>
					</div>
				</div>
			</div>
			<h2 id="meat">Meat</h2>
			<div class="row">
				<div class="col-md-3">
					<div class="card">
						<img src="images/chicken.jpg" alt="Chicken">
						<h3>Chicken</h3>
						<p class="price">Price: $3.99</p>
						<p class="quantity">Quantity: 1 kg</p>
						<p>Category: Meat</p>
						<button class="add-to-cart" onclick="addInCart(this)">Add
							to Cart</button>
					</div>
				</div>
				<div class="col-md-3">
					<div class="card">
						<img src="images/beef.jpg" alt="Beef">
						<h3>Beef</h3>
						<p class="price">Price: $4.99</p>
						<p class="quantity">Quantity: 1 kg</p>
						<p>Category: Meat</p>
						<button class="add-to-cart" onclick="addInCart(this)">Add
							to Cart</button>
					</div>
				</div>
				<div class="col-md-3">
					<div class="card">
						<img src="images/pork.jpg" alt="Pork">
						<h3>Pork</h3>
						<p class="price">Price: $3.99</p>
						<p class="quantity">Quantity: 1 kg</p>
						<p>Category: Meat</p>
						<button class="add-to-cart" onclick="addInCart(this)">Add
							to Cart</button>
					</div>
				</div>
			</div>
			<h2 id="poultry">Poultry</h2>
			<div class="row">
				<div class="col-md-3">
					<div class="card">
						<img src="images/turkey.jpg" alt="Turkey">
						<h3>Turkey</h3>
						<p class="price">Price: $4.99</p>
						<p class="quantity">Quantity: 1 kg</p>
						<p>Category: Poultry</p>
						<button class="add-to-cart" onclick="addInCart(this)">Add
							to Cart</button>
					</div>
				</div>
				<div class="col-md-3">
					<div class="card">
						<img src="images/duck.jpg" alt="Duck">
						<h3>Duck</h3>
						<p class="price">Price: $4.99</p>
						<p class="quantity">Quantity: 1 kg</p>
						<p>Category: Poultry</p>
						<button class="add-to-cart" onclick="addInCart(this)">Add
							to Cart</button>
					</div>
				</div>
				<div class="col-md-3">
					<div class="card">
						<img src="images/goose.jpg" alt="Goose">
						<h3>Goose</h3>
						<p class="price">Price: $4.99</p>
						<p class="quantity">Quantity: 1 kg</p>
						<p>Category: Poultry</p>
						<button class="add-to-cart" onclick="addInCart(this)">Add
							to Cart</button>
					</div>
				</div>
			</div>
		</div>
		<button class="cart-button" onclick="toggleCart()">Cart</button>
		<div class="cart-sidebar">
			<h2>Cart</h2>
			<ul class="cart-list">
				<!-- Cart items will be added here -->
			</ul>
			<p>Total: $0.00</p>
			<button class="checkout-button">Checkout</button>
		</div>
	</div>


	<script>
    
    document.querySelectorAll('.categories a').forEach((link) => {
        link.addEventListener('click', (event) => {
            event.preventDefault();
            let sectionId = link.getAttribute('href');
            let section = document.querySelector(sectionId);
            section.scrollIntoView({ behavior: 'smooth' });
        });
    });

    function toggleCart() {
        var cartSidebar = document.querySelector('.cart-sidebar');
        cartSidebar.classList.toggle('open');
    }

    </script>
</body>
</html>
