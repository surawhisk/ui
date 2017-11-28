package surawhisk

class NavComposer extends zk.grails.Composer {

	def afterCompose = { wnd ->
		$('#settings').on('click', {
			$("#namespace").parent().removeClass("active")

			$("#settings").parent().toggleClass("active")
			$d("#incmain").src("settings.zul")
		})

		$("#namespace").on("click", {
			$("#settings").parent().removeClass("active")

			$("#namespace").parent().toggleClass("active")
			$d("#incmain").src("namespaces.zul")
		})

		$("#create").on("click", {
			$("#namespace").parent().removeClass("active")
			$("#settings").parent().removeClass("active")

			$d("#incmain").src("actions_create.zul")
		})

		$("#invoke").on("click", {
			$("#namespace").parent().removeClass("active")
			$("#settings").parent().removeClass("active")

			$d("#incmain").src("actions_invoke.zul")
		})

	}

}