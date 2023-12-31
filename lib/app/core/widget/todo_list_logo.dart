import 'package:flutter/material.dart';
import 'package:todolist_provider/app/core/ui/theme/theme_extension.dart';

class TodoListLogo extends StatelessWidget {
  const TodoListLogo({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Column(
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        Image.asset(
          'assets/images/logo.png',
          height: 200,
        ),
        Text(
          'Gerencia de Atendimento',
          style: context.textTheme.titleLarge,
        )
      ],
    );
  }
}
